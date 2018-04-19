import java.util.ArrayList;

/**
 * Kelas DatabaseRoom 
 *
 * @author Cakti Fadhillah
 * @version 1.2
 * Since 10-3-18
 */

 public class DatabaseRoom
{
    //instance variables
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<Room>();

    public static boolean addRoom(Room baru)
    {
        if (baru.getHotel() != null)
        {
            for (Room var : ROOM_DATABASE) {
                if (var.getNomorKamar().equals(baru.getNomorKamar()))
                {
                    return false;
                }
            }
            return ROOM_DATABASE.add(baru);
        }
        return false;
    }

    public static Room getRoom(Hotel hotel, String nomor_kamar)
    {
        for (Room var : ROOM_DATABASE) {
            if (var.getHotel().equals(hotel) && var.getNomorKamar().equals(nomor_kamar))
            {
                return var;
            }
        }
        return null;
    }

    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel)
    {
        ArrayList<Room> res = new ArrayList<Room>();

        for (Room var : ROOM_DATABASE) {
            if (var.getHotel().equals(hotel))
            {
                res.add(var);
            }
        }
        return res;
    }

    public static ArrayList<Room> getVacantRooms()
    {
        ArrayList<Room> res = new ArrayList<Room>();

        for (Room var : ROOM_DATABASE) {
            if (var.getStatusKamar().equals(StatusKamar.Vacant))
            {
                res.add(var);
            }
        }
        return res;
    }

    public static boolean removeRoom(Hotel hotel, String nomor_kamar)
    {
        Room tempRoom = getRoom(hotel, nomor_kamar);

        if (tempRoom != null)
        {
            Pesanan tempPesanan = DatabasePesanan.getPesanan(tempRoom);
            if (tempPesanan != null)
            {
                Administrasi.pesananDibatalkan(tempPesanan);
            }
            return ROOM_DATABASE.remove(tempRoom);
        }
        return false;
    }

    public static ArrayList<Room> getRoomDatabase()
    {
        return ROOM_DATABASE;
    }
}