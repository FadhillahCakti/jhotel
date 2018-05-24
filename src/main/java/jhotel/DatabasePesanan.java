package jhotel;
/**
 * Class DatabasePesanan.
 *
 * @author Cakti Fadhillah
 * @version 1.10 -24 Mei 2018
 */

import java.util.ArrayList;
public class DatabasePesanan
{//instance variable

    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<>(); //lokasi memori telah dipesan
    private static int LAST_PESANAN_ID = 0;

	/**
     * Konstruktor dari Class DatabasePesanan
     */


    public static ArrayList<Pesanan> getPesananDatabase(){
        return PESANAN_DATABASE;
    }

	/**
     * Method dari getLastPesananID
     * Mengambil nilai return dari LAST_PESANAN_ID
     * 
     * @return LAST_PESANAN_ID
     */

    public static int getLastPesananID(){
        return LAST_PESANAN_ID;
    }

	/**
     * Method dari addPesanan denagn throws dari PesananSudahAdaException
     * Menambahkan nilai data dari return PESANAN_DATABASE dan LAST_PESANAN_ID
     * 
     * @return for LAST_HOTEL_ID
     */

    public static boolean addPesanan(Pesanan baru) throws PesananSudahAdaException
    {
        if(getPesananAktif(baru.getPelanggan()) == null){
            PESANAN_DATABASE.add(baru);
            LAST_PESANAN_ID = baru.getID();
            return true;
        }
        else {
            throw new PesananSudahAdaException(baru);
        }
    }

	/**
     * Method dari getPesanan
     * Mengambil nilai return dari id pelanggan
     * 
     * @return pesan
     */

    public static Pesanan getPesanan (int id){
        for(Pesanan pesan : PESANAN_DATABASE){
            if(pesan.getID()==id){
                return pesan;
            }
        }
        return null;
    }

	/**
     * Method dari getPesananAktif
     * Mengambil nilai return dari kamar dan status aktif
     * 
     * @return pesan atau null
     */


    public static Pesanan getPesananAktif(Room kamar){
        for (Pesanan pesan :
                PESANAN_DATABASE) {
            if(pesan.getRoom()==kamar && pesan.getStatusAktif()==true ){
                return pesan ;
            }
        }
        return null;
    }

	/**
     * Method dari getPesananAktif
     * Mengambil nilai return dari customer pelanggan
     * 
     * @return pesan atau null
     */


    public static Pesanan getPesananAktif(Customer pelanggan){
        for (Pesanan pesan :
                PESANAN_DATABASE) {
            if (pesan.getStatusAktif() == true && pesan.getPelanggan().equals(pelanggan) == true){
                return pesan;
            }
        }
        return null;
    }

	/**
     * Method dari removePesanan denagn throws dari PesananTidakDitemukanException
     * Mengambil nilai return dari PESANAN_DATABASE 
     * 
     * @return for dan if statement dengan throw dari PESANAN_DATABASE
     */

    public static boolean removePesanan(Pesanan pesan) throws PesananTidakDitemukanException{
        for (Pesanan pesan2 :
                PESANAN_DATABASE) {
            if(pesan.equals(pesan2)){
                if(pesan.getRoom() != null) Administrasi.pesananDibatalkan(pesan);
                else if(pesan.getStatusAktif() == true) pesan.setStatusAktif(false);
                PESANAN_DATABASE.remove(pesan2);
                return true;
            }
        }
        throw new PesananTidakDitemukanException(pesan.getPelanggan());
    }
}