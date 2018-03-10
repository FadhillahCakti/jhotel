/**
 * Class Lokasi.
 *
 * @author Cakti Fadhillah
 * @version 1.2
 * @since 10-3-18
 */

public class Lokasi
{
    private float x_coord;
    private float y_coord;
    private String deskripsiLokasi;

    /**
     * 
     * @param koordinat x pada peta dengan tipe float
     * @param koordinat y pada peta dengan tipe float
     * @param deskripsi lokasi dengan tipe String
     */
    public Lokasi(float x_coord, float y_coord, String deskripsiLokasi)
    {
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsiLokasi = deskripsiLokasi;
    }

    /**
     * 
     * @param   aksesor dengan x_coord 
     * @return  koordinat x dengan tipe float
     */
    public float getX()
    {
        return this.x_coord;
    }

    /**
     * 
     * @param   aksesor untuk y_coord 
     * @return  koordinat y dengan tipe float
     */
    public float getY()
    {
        return this.y_coord;
    }

    /**
     * 
     * @param   aksesor untuk deskripsi
     * @return  deskripsi lokasi dengan tipe String
     */
    public String getDesksipsi()
    {
        return this.deskripsiLokasi;
    }

    /**
     * @param   mutator dengan x_coord 
     * @return  koordinat x dengan tipe float
     */
    public void setX(float x_coord)
    {
        this.x_coord = x_coord;
    }

    /**
     * 
     * @param   mutator dengan y_coord 
     * @return  koordinat y dengan tipe float
     */
    public void setY(float y_coord)
    {
        this.y_coord = y_coord;
    }

    /**
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
}