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
    private ArrayList<Hotel> list_hotel;

    public boolean addHotel(Hotel baru)
    {
       return list_hotel.add(baru);
    }

    public boolean removeHotel(int id)
    {
        return false;
    }

    public ArrayList<Hotel> getHotelDatabase()
    {
        return this.list_hotel;
    }
}