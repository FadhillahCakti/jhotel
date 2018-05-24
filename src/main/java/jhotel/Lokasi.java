package jhotel;
/**
 * Class Lokasi.
 *
 * @author Cakti Fadhillah
 * @version 1.10 - 24 Mei 2018
 */
public class Lokasi
{
    //instance variables
    private float x_coord;
    private float y_coord;
    private String deskripsiLokasi;

     /**
     * Constructor for objects of class Lokasi.
     * 
     * @param x coord  untuk menentukan koordinat x
     * @param y coord  untuk menentukan koordinat y
     * @param deskripsiLokasi  untuk menentukan deskripsi lokasi
     */

public Lokasi(float x_coord, float y_coord, String deskripsiLokasi)
    {
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsiLokasi = deskripsiLokasi;
    }

     /**
     * method setX
     * 
     * @param x_coord
     */

    public void setX(float x_coord)
    {
        this.x_coord = x_coord;
    }

     /**
     * method setY
     * 
     * @param y_coord
     */

    public void setY(float y_coord)
    {
        this.y_coord = y_coord;
    }

     /**
     * method setDeskripsi
     * 
     * @param deskripsi
     */

    public void setDeskripsi(String deskripsi)
    {
        this.deskripsiLokasi = deskripsi;
    }

     /**
     * method getX
     * 
     * @return x_coord
     */

    public float getX()
    {
        return x_coord;
    }

     /**
     * method getY
     * 
     * @return y_coord
     */

    public float getY()
    {
        return y_coord;
    }

     /**
     * method getDeskripsi
     * 
     * @return lokasi
     */

    public String getDeskripsi()
    {
        return deskripsiLokasi;
    }

     /**
     * method string ToString
     * 
     * @return koordinat x
     * @return koordinat y
     * @return deskripsi
     */

    public String toString()
    {
        return "Koordinat X\t:"+ x_coord + "\nKoordinat Y\t:" + y_coord +"\nDeskripsi\t:"+deskripsiLokasi;
    }
}