package jhotel;
import java.util.ArrayList;

/**
 * Class DatabaseHotel.
 *
 * @author Cakti Fadhillah
 * @version 1.10 - 24 Mei 2018
 */

public class DatabaseHotel
{//instance variable

    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<>();
    private static int LAST_HOTEL_ID = 0;

	/**
     * Konstruktor dari Class DatabaseHotel
     */

    public static ArrayList<Hotel> getHotelDatabase() {
        return HOTEL_DATABASE;
    }

	/**
     * Method dari getLastHotelID
     * Mengambil nilai return dari LAST_HOTEL_ID
     * 
     * @return LAST_HOTEL_ID
     */

    public static int getLastHotelID() {
        return LAST_HOTEL_ID;
    }

	/**
     * Method dari addHotel denagn throws dari HotelSudahAdaException
     * Menambahkan nilai data dari return HOTEL_DATABASE dan LAST_HOTEL_ID
     * 
     * @return for LAST_HOTEL_ID
     */

    public static boolean addHotel(Hotel baru) throws HotelSudahAdaException{
        for (Hotel hotel :
                HOTEL_DATABASE) {
            if(hotel.getID() == baru.getID() || (hotel.getLokasi().equals(baru.getLokasi()) && hotel.getNama().compareTo(baru.getNama())==0)){
                throw new HotelSudahAdaException(hotel);
            }
        }
        HOTEL_DATABASE.add(baru);
        LAST_HOTEL_ID = baru.getID();
        return true;
    }

	/**
     * Method dari removeHotel denagn throws dari PelangganTidakDitemukanException
     * Mengambil nilai return dari HOTEL_DATABASE 
     * 
     * @return for dan if statement dengan throw dari HOTEL_DATABASE
     */

    public static boolean removeHotel(int id) throws HotelTidakDitemukanException {
        for (Hotel hotel :  HOTEL_DATABASE) {
            if(hotel.getID()==id){
                for (Room kamar :
                        DatabaseRoom.getRoomsFromHotel(hotel)) {
                    try{
                        DatabaseRoom.removeRoom(hotel, kamar.getNomorKamar());
                    }
                    catch(RoomTidakDitemukanException e){
                        e.getPesan();
                    }
                }
                HOTEL_DATABASE.remove(hotel);
                return true;
            }
        }
        throw new HotelTidakDitemukanException(id);
    }

	/**
     * Method dari getHotel
     * Mengambil nilai return dari id pelanggan
     * 
     * @return hotel
     */

    public static Hotel getHotel(int id)
    {
        for (Hotel hotel :
                HOTEL_DATABASE) {
            if(hotel.getID()==id)
                return hotel;

        }
        return null;
    }


}