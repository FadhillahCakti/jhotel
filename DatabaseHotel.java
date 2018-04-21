import java.util.ArrayList;

/**
 * Kelas DatabaseHotel 
 *
 * @author Cakti Fadhillah
 * @version 1.2
 * @since 10-3-18
 */

public class DatabaseHotel
{
    //instance variables
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<Hotel>();
    private static int LAST_HOTEL_ID = 0;

    public static boolean addHotel(Hotel baru) throws HotelSudahAdaException
    {
        for (Hotel var : HOTEL_DATABASE)
        {
            if (var.getID() == baru.getID() || (var.getNama().equals(baru.getNama()) && var.getLokasi().equals(baru.getLokasi())))
            {
                throw new HotelSudahAdaException(baru);
            }
        }

        LAST_HOTEL_ID = baru.getID();
        return HOTEL_DATABASE.add(baru);
    }

    public static Hotel getHotel(int id)
    {
        for (Hotel var : HOTEL_DATABASE)
        {
            if (var.getID() == id)
            {
                return var;
            }
        }

        return null;
    }

    public static boolean removeHotel(int id) throws HotelTidakDitemukanException
    {
        for (Hotel var : HOTEL_DATABASE) {
            if (var.getID()==id)
            {
                for (Room kamar : DatabaseRoom.getRoomsFromHotel(var)) {
                    try
                    {
                        DatabaseRoom.removeRoom(var, kamar.getNomorKamar());
                    } catch (RoomTidakDitemukanException e)
                    {
                        System.out.println("-Exception Room Tidak Ditemukan-");
                        System.out.println(e.getPesan());
                    }
                }

                return HOTEL_DATABASE.remove(var);
            }
        }

        throw new HotelTidakDitemukanException(id);
        //return false;
    }

    public static int getLastHotelID()
    {
        return LAST_HOTEL_ID;
    }

    public static ArrayList<Hotel> getHotelDatabase()
    {
        return HOTEL_DATABASE;
    }
}