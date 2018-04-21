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
    // instance variables
    private int id;
    private boolean isAktif;
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private Date tanggalPesan;

    public Pesanan(double jumlahHari, Customer pelanggan)
    {
        // initialise instance variables
        id = DatabasePesanan.getLastPesananID() + 1;
        this.pelanggan = pelanggan;
        this.jumlahHari = jumlahHari;
        this.isDiproses = false;
        this.isSelesai = false;
        isAktif = true;
        tanggalPesan = new GregorianCalendar().getTime();
    }

    /**
     * getBiaya method
     * accessor objek ini untuk variable biaya
     *
     * @return    double biaya pesanan
     */
    public double getBiaya()
    {
        return this.biaya;
    }

    /**
     * getPelanggan method
     * accessor objek ini untuk variable pelanggan
     *
     * @return  Customer pelanggan yang memesan
     */
    public Customer getPelanggan()
    {
        return this.pelanggan;
    }

    /**
     * getStatusDiproses method
     * accessor objek ini untuk variable isDiproses
     *
     * @return  boolean   status diproses/isDiproses
     */
    public boolean getStatusDiproses()
    {
        return this.isDiproses;
    }

    /**
     * getStatusSelesai method
     * accessor objek ini untuk variable isSelesai
     *
     * @return  boolean    status selesai/isSelesai
     */
    public boolean getStatusSelesai()
    {
        return this.isSelesai;
    }

    /**
     * getrRoom method
     * accessor objek ini untuk variable kamar
     *
     * @return    Room kamar yang terlink ke pesanan ini
     */
    public Room getRoom()
    {
        return this.kamar;
    }

    public Date getTanggalPesan()
    {
        return this.tanggalPesan;
    }

    public boolean getStatusAktif()
    {
        return this.isAktif;
    }

    public int getID()
    {
        return this.id;
    }

    public void setID(int id)
    {
        this.id = id;
    }

    public void setStatusAktif(boolean aktif)
    {
        this.isAktif = aktif;
    }

    public void setTanggalPesan(Date tanggalPesan)
    {
        this.tanggalPesan = tanggalPesan;
    }

    /**
     * setBiaya method
     * mutator objek ini untuk variable biaya
     *
     * @param  double    biaya pesanan
     */
    public void setBiaya()
    {
        this.biaya = this.kamar.getDailyTariff() * this.jumlahHari;
    }

    /**
     * getPelanggan method
     * mutator objek ini untuk variable pelanggan
     *
     * @param  pelanggan Customer yang memesan
     */
    public void setPelanggan(Customer pelanggan)
    {
        this.pelanggan = pelanggan;
    }

    /**
     * setStatusDiproses method
     * mutator objek ini untuk variable isDiproses
     *
     * @param boolean apakah pesanan sudah diproses
     */
    public void setStatusDiproses(boolean diproses)
    {
        this.isDiproses = diproses;
    }

    /**
     * setStatusSelesai method
     * mutator objek ini untuk variable isSelesai
     *
     * @param  boolean apakah pesanan telah selesai
     */
    public void setStatusSelesai(boolean selesai)
    {
        this.isSelesai = selesai;
    }

    /**
     * setrRoom method
     * mutator objek ini untuk variable kamar
     *
     * @param    Room kamar yang akan di link ke pesanan ini
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
        System.out.println("Nama Pelanggan : "+ this.pelanggan.getNama());
        System.out.println("Jumlah Hari : "+ this.jumlahHari);
        System.out.println("Biaya : Rp."+ this.biaya);
        System.out.println("Status Diproses : "+ this.isDiproses);
        System.out.println("Status Selesai : "+ this.isSelesai);
    }

    public String toString()
    {
        String final_status = "KOSONG";

        if (isDiproses && !isSelesai)
        {
            final_status = "DIPROSES";
        }
        else if(!isDiproses && !isSelesai)
        {
            final_status = "KOSONG";
        }
        else if(!isDiproses && isSelesai)
        {
            final_status = "SELESAI";
        }

        if (kamar != null)
        {
            return "Dibuat oleh "+this.pelanggan.getNama() +". Proses booking untuk "+this.kamar.getHotel().getNama()+ " kamar nomor "+this.kamar.getNomorKamar()+" dengan tipe kamar yang diinginkan "+this.kamar.getTipeKamar()+". Status : "+final_status+".";
        }
        else
        {
            return "Dibuat oleh "+this.pelanggan.getNama() + ". Status : "+final_status+".";
        }
    }
}
