/**
 * Class Lokasi.
 *
 * @author Cakti Fadhillah
 * @version 1.2
 * @since 10-3-18
 */

public class Lokasi
{
    //instance variable
    private float x_coord;
    private float y_coord;
    private String deskripsiLokasi;

    /**
     * Constructor for objects of class Lokasi
     *
     * @param float koordinat x pada peta
     * @param float koordinat y pada peta
     * @param String deskripsi lokasi
     */
    public Lokasi(float x_coord, float y_coord, String deskripsiLokasi)
    {
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsiLokasi = deskripsiLokasi;
    }

    /**
     * getx method
     * accessor objek ini untuk variable x_coord
     *
     * @return  float koordinat x pada peta
     */
    public float getX()
    {
        return this.x_coord;
    }

    /**
     * gety method
     * accessor objek ini untuk variable y_coord
     *
     * @return  float koordinat y pada peta
     */
    public float getY()
    {
        return this.y_coord;
    }

    /**
     * getDeskripsi method
     * accessor objek ini untuk variable deskripsiLokasi
     *
     * @return  String deskripsi lokasi
     */
    public String getDesksipsi()
    {
        return this.deskripsiLokasi;
    }

    /**
     * setX method
     * mutator objek ini untuk variable x_coord
     *
     * @param  float koordinat x pada pet
     */
    public void setX(float x_coord)
    {
        this.x_coord = x_coord;
    }

    /**
     * setY method
     * mutator objek ini untuk variable y_coord
     *
     * @param  float koordinat y pada pet
     */
    public void setY(float y_coord)
    {
        this.y_coord = y_coord;
    }

    /**
     * setDeskripsi method
     * mutator objek ini untuk variable deskripsiLokasi
     *
     * @param  String deskripsi lokasi
     */
    public void setDeskripsi(String deskripsiLokasi)
    {
        this.deskripsiLokasi = deskripsiLokasi;
    }

    /**
     * PrintData method
     *
     * method ini akan mencetak deskripsi lokasi di console
     */
    public void printData()
    {
        System.out.println("Lokasi");
        System.out.println("Koordinat X : "+ this.x_coord);
        System.out.println("Koordinat Y : "+ this.y_coord);
        System.out.println("Deskripsi : "+ this.deskripsiLokasi);
    }

    public String toString()
    {
        return "Lokasi\nKoordinat X : "+this.x_coord+"\nKoordinat Y : "+this.y_coord+"\nDekripsi : "+this.deskripsiLokasi+"\n";
    }
}