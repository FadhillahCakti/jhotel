/**
 * Class Hotel.
 *
 * @author Cakti Fadhillah
 * @version 1.2
 * @since 10-3-18
 */

public class Hotel
{
    private String nama;
    private Lokasi lokasi;
    private int bintang;

    /**
     * 
     * @param nama hotel dengan tipe String
     * @param lokasi hotel dengan variable Lokasi
     * @param Bintang hotel dengan tipe int
     */
    public Hotel(String nama, Lokasi lokasi, int bintang)
    {
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
    }

    /**
     * 
     * @param   aksesor untuk Nama
     * @return  Nama hotel dengan tipe String
     */
    public String getNama()
    {
        return this.nama;
    }

    /**
     * @param   Aksesor untuk Nama
     * @return  lokasi hotel dengan variabel Lokasi
     */
    public Lokasi getLokasi()
    {
        return this.lokasi;
    }

    /**
     * 
     * @param   Aksesor untuk Bintang
     * @return  Nama hotel dengan tipe String
     */
    public int getBintang()
    {
        return this.bintang;
    }

    /**
     * 
     * @param  String Nama hotel
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }

    /**
     * 
     * @param  Lokasi lokasi hotel
     */
    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi = lokasi;
    }

    /**
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