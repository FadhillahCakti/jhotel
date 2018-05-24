package jhotel;
/**
 * Class Room
 *
 * @author Cakti Fadhillah
 * @version 1.10 - 24 Mei 2018
 */
public abstract class Room {
//instance variable
    private Hotel hotel;
    private String nomor_kamar;
    protected double dailyTariff;
    private StatusKamar status_kamar;

     /**
     * Constructor for objects of class Room.
     * 
     * @param Hotel untuk menentukan jenis hotel
     * @param String untuk memnentukan nomor kamar
     */

    public Room(Hotel hotel, String nomor_kamar) {
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        status_kamar=status_kamar.Vacant;
    }

     /**
     * method setHotel
     * 
     * @param hotel
     */

    public void setHotel(Hotel hotel)
    {
        this.hotel = hotel;
    }

     /**
     * method setNomorKamar
     * 
     * @param nomor_kamar
     */

    public void setNomorKamar(String nomor_kamar) {
        this.nomor_kamar = nomor_kamar;
    }

     /**
     * method setDailyTariff
     * 
     * @param dailyTariff
     */

    public void setDailyTariff(double dailyTariff)
    {
        this.dailyTariff = dailyTariff;
    }

     /**
     * method setStatusKamar
     * 
     * @param status_kamar
     */

    public void setStatusKamar(StatusKamar status_kamar)
    {
        this.status_kamar = status_kamar;
    }

     /**
     * method getStatusKamar
     * 
     * @return status_kamar
     */

    public StatusKamar getStatusKamar() {
        return status_kamar;
    }

     /**
     * method getHotel
     * 
     * @return hotel
     */

    public Hotel getHotel()
    {
        return hotel;
    }

     /**
     * method getNomorKamar
     * 
     * @return nomor_kamar
     */

    public String getNomorKamar()
    {
        return nomor_kamar;
    }

     /**
     * method getDailyTariff
     * 
     * @return dailyTariff
     */

    public double getDailyTariff()
    {
        return dailyTariff;
    }

     /**
     * method getTipeKamar
     * 
     * @return TipeKamar
     */

    public abstract TipeKamar getTipeKamar();

     /**
     * method ToString
     * 
     * @param kamar dengan if statement
     */

    public String toString()
    {
        if (DatabasePesanan.getPesananAktif(this) == null)
        {
            return "\nNama Hotel \t\t:" + getHotel().getNama()
                    + "\nTipe Kamar \t\t:" + getTipeKamar()
                    + "\nHarga \t\t:" + getDailyTariff()
                    + "\nStatus Kamar \t\t:" + getStatusKamar().toString();
        }
        else
        {
            return "\nNama Hotel \t\t:" + getHotel().getNama()
                    + "\nTipe Kamar \t\t:" + getTipeKamar()
                    + "\nHarga \t\t:" + getDailyTariff()
                    + "\nStatus Kamar \t\t:" + getStatusKamar().toString()
                    + "Pelanggan \t\t:" + DatabasePesanan.getPesananAktif(this).getPelanggan().getNama();
        }
    }
}
