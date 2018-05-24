package jhotel;
/**
 * Class DatabaseRoom.
 *
 * @author Cakti Fadhillah
 * @version 1.10 - 24 Mei 2018
 */
import java.util.ArrayList;

public class DatabaseRoom
{//instance variable

    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<>();

	/**
     * Konstruktor dari Class DatabaseRoom
     */

    public static ArrayList<Room> getRoomDatabase(){
        return ROOM_DATABASE;
    }

	/**
     * Method dari addRoom denagn throws dari RoomSudahAdaException
     * Menambahkan nilai data dari return ROOM_DATABASE
     * 
     * @return for ROOM_DATABASE
     */

    public static boolean addRoom(Room baru) throws RoomSudahAdaException {
        if (baru.getHotel() != null) {
            for (Room kamar :
                    ROOM_DATABASE) {
                if (kamar.getHotel().equals(baru.getHotel())) {
                    if (baru.getNomorKamar().compareTo(kamar.getNomorKamar()) == 0) {
                        throw new RoomSudahAdaException(baru);
                    }
                }
            }
            ROOM_DATABASE.add(baru);
            return true;
        } else {
            return false;
        }
    }

	/**
     * Method dari getrOOM
     * Mengambil nilai return dari KAMAR
     * 
     * @return kamar
     */

    public static Room getRoom(Hotel hotel,String nomor_kamar){
        for (Room kamar :
                ROOM_DATABASE) {
            if (kamar.getHotel().equals(hotel) && kamar.getNomorKamar().compareTo(nomor_kamar) == 0) {
                return kamar;
            }
        }
        return null;
    }

	/**
     * Method dari getRoomsFromHotel
     * Mengambil nilai return dari ROOM_DATABASE
     * @param hotel
     * @return toReturn
     */

    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel){
        ArrayList<Room> toReturn = new ArrayList<>();
        for (Room kamar :
                ROOM_DATABASE) {
            if(kamar.getHotel().equals(hotel)){
                toReturn.add(kamar);
            }
        }
        return toReturn;
    }

	/**
     * Method dari getVacantRooms
     * Mengambil nilai return dari ROOM_DATABASE
     *
     * @return toReturn
     */


    public static ArrayList<Room> getVacantRooms(){
        ArrayList<Room> toReturn = new ArrayList<>();
        for (Room kamar :
                ROOM_DATABASE) {
            if(kamar.getStatusKamar().equals(StatusKamar.Vacant)){
                toReturn.add(kamar);
            }
        }
        return toReturn;
    }

	/**
     * Method dari removeRoom denagn throws dari RoomTidakDitemukanException
     * Mengambil nilai return dari ROOM_DATABASE 
     * 
     * @return for dan if statement dengan throw dari ROOM_DATABASE
     */


    public static boolean removeRoom(Hotel hotel, String nomor_kamar) throws RoomTidakDitemukanException{
        for (Room kamar :
                ROOM_DATABASE) {
            if(kamar.getHotel().equals(hotel)){
                if(kamar.getNomorKamar().compareTo(nomor_kamar) == 0){
                    Administrasi.pesananDibatalkan(kamar);
                    ROOM_DATABASE.remove(kamar);
                    return true;
                }
            }
        }
        throw new RoomTidakDitemukanException(hotel,nomor_kamar);
    }

}