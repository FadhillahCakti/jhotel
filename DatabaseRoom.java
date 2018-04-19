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
    private ArrayList<Room> ROOM_DATABASE = new ArrayList<Room>();

    public boolean addRoom(Room baru)
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

    public Room getRoom(Hotel hotel, String nomor_kamar)
    {
        for (Room var : ROOM_DATABASE) {
            if (var.getHotel().equals(hotel) && var.getNomorKamar().equals(nomor_kamar))
            {
                return var;
            }
        }
        return null;
    }

    public ArrayList<Room> getRoomsFromHotel(Hotel hotel)
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

    public ArrayList<Room> getVacantRooms()
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

    public boolean removeRoom(Hotel hotel, String nomor_kamar)
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

    public ArrayList<Room> getRoomDatabase()
    {
        return ROOM_DATABASE;
    }
}