/**
 * Class Hotel.
 *
 * @author Cakti Fadhillah
 * @version 1.2
 * @since 10-3-18
 */

public class Hotel
{
    //instance variable
    private int id;
    private String nama;
    private Lokasi lokasi;
    private int bintang;

    /**
     * Constructor for objects of class Hotel
     *
     * @param String nama hotel
     * @param Lokasi Lokasi hotel
     * @param int Bintang hotel
     */
    public Hotel(String nama, Lokasi lokasi, int bintang)
    {
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
        this.id = DatabaseHotel.getLastHotelID() + 1;
    }

    /**
     * getNama method
     * accessor objek ini untuk variable nama
     *
     * @return  String Nama hotel
     */
    public String getNama()
    {
        return this.nama;
    }

    /**
     * getLokasi method
     * accessor objek ini untuk variable lokasi
     *
     * @return  Lokasi lokasi hotel
     */
    public Lokasi getLokasi()
    {
        return this.lokasi;
    }

    /**
     * getBintang method
     * accessor objek ini untuk variable bintang
     *
     * @return  String Nama hotel
     */
    public int getBintang()
    {
        return this.bintang;
    }

    public int getID()
    {
        return this.id;
    }

    public void setID(int id)
    {
        this.id = id;
    }

    /**
     * setNama method
     * mutator objek ini untuk variable nama
     *
     * @param  String Nama hotel
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }

    /**
     * setLokasi method
     * mutator objek ini untuk variable lokasi
     *
     * @param  Lokasi lokasi hotel
     */
    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi = lokasi;
    }

    /**
     * setBintang method
     * mutator objek ini untuk variable bintang
     *
     * @param  int bintang hotel
     */
    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }

    /**
     * PrintData method
     *
     * method ini akan mencetak nama hotel di console
     */
    public void printData()
    {
        System.out.println("Hotel");
        System.out.println("Nama Hotel : "+ this.nama);
        System.out.println("Lokasi : "+ this.lokasi.getDesksipsi());
        System.out.println("Bintang : "+ this.bintang);
    }

    public String toString()
    {
        return "Hotel\nNama Hotel : "+ this.nama + "\nLokasi : "+this.lokasi.getDesksipsi()+"\nBintang : "+this.bintang+"\n";
    }
}