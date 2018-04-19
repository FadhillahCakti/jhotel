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
    private ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<Hotel>();
    private int LAST_HOTEL_ID;

    public boolean addHotel(Hotel baru)
    {
        for (Hotel var : HOTEL_DATABASE) {
            if (var.getID() == baru.getID())
            {
                return false;
            }
        }
        LAST_HOTEL_ID = baru.getID();
        return HOTEL_DATABASE.add(baru);
    }

    public  Hotel getHotel(int id)
    {
        for (Hotel var : HOTEL_DATABASE) {
            if (var.getID()==id)
            {
                return var;
            }
        }

        return null;
    }

    public boolean removeHotel(int id)
    {
        for (Hotel var : HOTEL_DATABASE) {
            if (var.getID()==id)
            {
                for (Room kamar : DatabaseRoom.getRoomsFromHotel(var)) 
                {
                    DatabaseRoom.removeRoom(var, kamar.getNomorKamar());
                }

                return HOTEL_DATABASE.remove(var);
            }
        }

        return false;
    }

    public int getLastHotelID()
    {
        return LAST_HOTEL_ID;
    }

    public ArrayList<Hotel> getHotelDatabase()
    {
        return HOTEL_DATABASE;
    }
}