/**
 *Class Pesanan.
 *
 * @author Cakti Fadhillah
 * @version 1.2
 * @since 10-3-18
 */

public class Pesanan
{
    private double biaya;
    private Customer pelanggan;
    private String nama_pelanggan;
    private TipeKamar tipe_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;

    /**
     * Constructor dari kelas Pesanan
     * 
     * @param   biaya pesanan dengan tipe double
     * @param   pelanggan dengan hub tipe Customer
     */
    public Pesanan(double biaya, Customer pelanggan)
    {
        this.biaya = biaya;
        this.pelanggan = pelanggan;
        this.nama_pelanggan = null;
        this.tipe_kamar = null;
        this.isDiproses = false;
        this.isSelesai = false;
        this.kamar = kamar;
    }

    /**
     * 
     * @param     accessor untuk variable biaya
     * @return    biaya pesanan dengan tipe double
     */
    public double getBiaya()
    {
        return this.biaya;
    }
    
    /**
     * @param     accessor untuk variable pelanggan
     * @return    pelanggan pesanan dengan tipe Pesanan ini
     * 
     */
    public Customer getPelanggan()
    {
        return this.pelanggan;
    }

    /**
     * @param     accessor untuk Nama Pelanggan 
     * @return    Nama Pelanggan dengan tipe string
     * 
     */
    public String getNamaPelanggan()
    {
        return this.nama_pelanggan;
    }

    /**
     * @param     accessor untuk Tipe Kamar
     * @return    Tipe Kamar dengan variabel tipe kamar
     * 
     */
    public TipeKamar getTipeKamar()
    {
        return this.tipe_kamar;
    }
    
    /**
     * @param     accessor untuk Status Diproses
     * @return    Status Diproses dengan tipe Boolean
     *
     */
    public boolean getStatusDiproses()
    {
        return this.isDiproses;
    }
    
    /**
     * @param     accessor untuk Status Diproses
     * @return    Status Diproses dengan tipe Boolean
     * 
     */
    public boolean getStatusSelesai()
    {
        return this.isSelesai;
    }

    /**
     * @param     accessor untuk Status Diproses
     * @return    pelanggan pesanan dengan tipe Pesanan ini 
     * 
     */
    public Room getRoom()
    {
        return this.kamar;
    }
    
    /**
     * @param     mutator untuk Biaya
     * @return    biaya Pesanan dengan tipe biaya ini 
     * 
     */
    public void setBiaya(double biaya)
    {
        this.biaya = biaya;
    }
    
    /**
     * @param     accessor untuk Pelanggan
     * @return    pelanggan pesanan dengan tipe Pesanan ini 
     * 
     */
    public void setPelanggan(Customer pelanggan)
    {
        this.pelanggan = pelanggan;
    }

    /**
     * @param     mutator untuk Nama Pelanggan
     * @return    nama pelanggan pesanan dengan tipe Nama Pelanggan ini 
     * 
     */
    public void setNamaPelanggan(String nama_pelanggan)
    {
        this.nama_pelanggan = nama_pelanggan;
    }

    /**
     * @param     mutator untuk Tipe Kamar
     * @return    tipe kamar pesanan dengan Tipe Kamar ini 
     * 
     */
    public void setTipeKamar(TipeKamar tipe_kamar)
    {
        this.tipe_kamar = tipe_kamar;
    }
    
    /**
     * @param     mutator untuk Status Diproses
     * @return    Status Diproses dengan tipe Boolean
     * 
     */
    public void setStatusDiproses(boolean diproses)
    {
        this.isDiproses = diproses;
    }
    
    /**
     * @param     mutator untuk Status Selesai
     * @return    Status Selesai dengan tipe Boolean
     * 
     */
    public void setStatusSelesai(boolean selesai)
    {
        this.isSelesai = selesai;
    }

    /**
     * @param     mutator untuk Room
     * @return    tipe kamar pesanan dengan Tipe Kamar ini
     */
    public void setRoom(Room kamar)
    {
        this.kamar = kamar;
    }

    /**
     * PrintData method
     *
     * method ini akan mencetak biaya pesanan
     */
    public void printData()
    {
        System.out.println("Pesanan");
        System.out.println("Nama Pelanggan : "+ this.nama_pelanggan);
        System.out.println("Tipe Kamar : "+ this.tipe_kamar);
        System.out.println("Status Diproses : "+ this.isDiproses);
        System.out.println("Status Selesai : "+ this.isSelesai);
    }
}
