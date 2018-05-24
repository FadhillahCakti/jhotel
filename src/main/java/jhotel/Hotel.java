package jhotel;
/**
 * Class Hotel.
 *
 * @author Cakti Fadhillah
 * @version 1.10 - 24 Mei 2018
 */
public class Hotel
{
    //instance variables
    private int ID;
    private String nama;
    private Lokasi lokasi;
    private int bintang;

     /**
     * Constructor for objects of class Hotel.
     * 
     * @param nama  untuk menentukan nama hotel
     * @param lokasi  untuk menentukan lokasi hotel
     * @param bintang  untuk menentukan hotel bintang berapa
     */
    public Hotel(String nama, Lokasi lokasi, int bintang)
    {
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
        this.ID=DatabaseHotel.getLastHotelID()+1;
    }

     /**
     * method getBintang
     * 
     * @return bintang 
     */
    public int getBintang()
    {
        return bintang;
    }

     /**
     * method getNama
     * 
     * @return nama
     */
    public String getNama()
    {
        return nama;
    }

     /**
     * method getID
     * 
     * @return ID
     */

    public int getID() {
        return ID;
    }

     /**
     * method getLokasi
     * 
     * @return lokasi
     */

    public Lokasi getLokasi()
    {
        return lokasi;
    }

     /**
     * method setBintang
     * 
     * @param nama
     */

    public void setNama(String nama)
    {
        this.nama = nama;
    }

     /**
     * method setLokasi
     * 
     * @param lokasi
     */


    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi = lokasi;
    }

     /**
     * method setBintang
     * 
     * @param bintang
     */

    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }

    /**
     * method setID
     * 
     * @param ID
     */

    public void setID(int ID) {
        this.ID = ID;
    }

     /**
     * method string ToString
     * 
     * @return nama
     * @return lokasi
     * @return bintang
     */

    public String toString()
    {
        return "Nama Hotel\t:" + nama + "\nLokasi\t\t:" + lokasi.getDeskripsi() + "\nBintang\t\t:"+bintang + "\n";
    }
}