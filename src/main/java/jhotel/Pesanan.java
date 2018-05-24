package jhotel;
import java.util.Date;

/**
 * Class Pesanan.
 *
 * @author Cakti Fadhillah
 * @version 1.10 - 24 Mei 2018
 */


public class Pesanan
{
    //instance variables
    private int id;
    private double biaya;
    private Customer pelanggan;
    private boolean isAktif;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private double jumlahHari;
    private Date tanggalPesan;

     /**
     * Constructor for objects of class Pesanan.
     * 
     * @param double jumlahHari untuk menentukan jumlah hari menginap
     * @param Customer pelanggan untuk menentukan pelanggan
     */

    public Pesanan(double jumlahHari, Customer pelanggan)
    {
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        this.kamar = kamar;
        this.isAktif = true;
        this.tanggalPesan = new Date();
        this.id = DatabasePesanan.getLastPesananID()+1;
    }

     /**
     * method getID
     * 
     * @return id
     */

    public int getID(){ return id;}

     /**
     * method getBiaya
     * 
     * @return biaya
     */

    public double getBiaya()
    {
        return biaya;
    }

     /**
     * method getJumlahHari
     * 
     * @return jumlahHari
     */

    public double getJumlahHari()
    {
        return jumlahHari;
    }

     /**
     * method getPelanggan
     * 
     * @return x_coord
     */

    public Customer getPelanggan()
    {
        return pelanggan;
    }

     /**
     * method getStatusAktif
     * 
     * @return isAktif
     */

    public boolean getStatusAktif(){return isAktif;}

     /**
     * method getStatusDiproses
     * 
     * @return isDiproses
     */

    public boolean getStatusDiproses()
    {
        return isDiproses;
    }

     /**
     * method getStatusSelesai
     * 
     * @return isSelesai
     */

    public boolean getStatusSelesai()
    {
        return isSelesai;
    }

     /**
     * method getRoom
     * 
     * @return kamar
     */

    public Room getRoom()
    {
        return kamar;
    }

     /**
     * method getTanggalPesan
     * 
     * @return tanggalPesan
     */

    public Date getTanggalPesan()
    {
        return tanggalPesan;
    }

     /**
     * method setID
     * 
     * @param ID
     */

    public void setID(int id){ this.id=id;}

     /**
     * method setBiaya
     * 
     * @param biaya
     */

    public void setBiaya()
    {
        biaya = kamar.getDailyTariff()*jumlahHari;
    }

     /**
     * method setJumlahHari
     * 
     * @param jumlahHari
     */

    public void setJumlahHari(double jumlahHari)
    {
        this.jumlahHari=jumlahHari;
    }

     /**
     * method setPelanggan
     * 
     * @param pelanggan
     */

    public void setPelanggan(Customer pelanggan)
    {
        this.pelanggan=pelanggan;
    }

     /**
     * method setStatusAktif
     * 
     * @param isAktif
     */

    public void setStatusAktif(boolean aktif){
        this.isAktif=isAktif;
    }

     /**
     * method setStatusDiproses
     * 
     * @param diproses
     */

    public void setStatusDiproses(boolean diproses)
    {
        isDiproses = diproses;
    }

     /**
     * method setStatusSelesai
     * 
     * @param selesai
     */

    public void setStatusSelesai(boolean selesai)
    {
        isSelesai=selesai;
    }

     /**
     * method setRoom
     * 
     * @param kamar
     */

    public void setRoom(Room kamar)
    {
        this.kamar=kamar;
    }

     /**
     * method ToString
     * 
     * @param pesanan dengan if statement
     */

    public String toString()
    {
        String final_status = "EMPTY";
        if(isDiproses == true && isSelesai == false) final_status = "ON PROCESS";
        else if(isDiproses == false && isSelesai == false) final_status = "EMPTY";
        else if(isDiproses == false && isSelesai == true) final_status = "DONE";


        if(getRoom() == null){
            return ("Dibuat oleh " + pelanggan.getNama() +
                    "\nStatus Pesanan: " + final_status + ".\n");
        }
        else {
            return ("Oleh:\n " + getPelanggan().getNama()
                    + ".\nProses booking :" + getRoom().getHotel().getNama()
                    + "\nNomor kamar:\n " + getRoom().getNomorKamar()
                    + "\nTipe Kamar:\n " + getRoom().getTipeKamar().toString()
                    + ".\n Status:\n " + final_status + ".");
        }
    }
     /**
     * method setTanggalPesan
     * 
     * @param tanggalPesan
     */
    public void setTanggalPesan(Date tanggalPesan)
    {
        this.tanggalPesan=tanggalPesan;
    }
}