import java.util.*;
import java.util.Date;
import java.util.regex.*;

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
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private Date tanggalPesan;

    /**
     * Constructor dari kelas Pesanan
     * 
     * @param   biaya pesanan dengan tipe double
     * @param   pelanggan dengan hub tipe Customer
     */
    public Pesanan(double jumlahHari, Customer pelanggan, Room kamar)
    {
        this.biaya = biaya;
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        this.isDiproses = false;
        this.isSelesai = false;
        this.kamar = kamar;
        this.tanggalPesan = tanggalPesan;
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
     * 
     * @param     accessor untuk variable biaya
     * @return    biaya pesanan dengan tipe double
     */
    public double getjumlahHari()
    {
        return this.jumlahHari;
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
     * @param     accessor untuk Status Diproses
     * @return    pelanggan pesanan dengan tipe Pesanan ini 
     * 
     */
    public Date getTanggalPesan()
    {
        return this.tanggalPesan;
    }
    
    /**
     * @param     mutator untuk Biaya
     * @return    biaya Pesanan dengan tipe biaya ini 
     * 
     */
    public void setBiaya(double biaya)
    {
        this.biaya = this.kamar.getDailyTariff() * this.jumlahHari;
    }
    
    /**
     * @param     accessor untuk Pelanggan
     * @return    pelanggan pesanan dengan tipe Pesanan ini 
     * 
     */
    public void setjumlahHari(double jumlahHari)
    {
        this.jumlahHari = jumlahHari;
    }

    /**
     * @param     mutator untuk Tipe Kamar
     * @return    tipe kamar pesanan dengan Tipe Kamar ini 
     * 
     */
    public void setPelanggan(Customer pelanggan)
    {
        this.pelanggan = pelanggan;
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
     * @param     mutator untuk Room
     * @return    tipe kamar pesanan dengan Tipe Kamar ini
     */
    public void setTanggalPesan(Date tanggalPesan)
    {
        this.tanggalPesan = tanggalPesan;
    }
    
    /**
     * PrintData method
     *
     * method ini akan mencetak biaya pesanan
     */
    public void printData()
    {
        System.out.println("Pesanan");
        System.out.println("Biaya : "+ this.biaya);
        System.out.println("JumlahHari : "+ this.jumlahHari);
        System.out.println("Pelanggan :" + this.pelanggan);
        System.out.println("Status Diproses : "+ this.isDiproses);
        System.out.println("Status Selesai : "+ this.isSelesai);
        System.out.println("Room : "+ this.kamar); 
        System.out.println("Date : "+ this.tanggalPesan); 
    }
}
