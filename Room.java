
/**
 * Class Room
 *
 * @author Cakti Fadhillah
 * @version 1.2
 * @since 10-3-18
 */
public abstract class Room
{
    //instance variable
    private Hotel hotel;
    private String nomor_kamar;
    protected double dailyTariff;
    private StatusKamar status_kamar;

    public Room(Hotel hotel, String nomor_kamar)
    {
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.status_kamar = StatusKamar.Vacant;
    }

    //Constructor Kelas room
    public Room(Hotel hotel, String nomor_kamar, StatusKamar status_kamar)
    {
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.status_kamar = status_kamar;
    }

    public Hotel getHotel()
    {
        return this.hotel;
    }

    public String getNomorKamar()
    {
        return this.nomor_kamar;
    }

    public double getDailyTariff()
    {
        return this.dailyTariff;
    }


    public StatusKamar getStatusKamar()
    {
        return this.status_kamar;
    }

    public abstract TipeKamar getTipeKamar();

    public void setHotel(Hotel hotel)
    {
        this.hotel = hotel;
    }

    public void setNomorKamar(String nomor_kamar)
    {
        this.nomor_kamar = nomor_kamar;
    }

    public void setDailyTariff(Double dailyTariff)
    {
        this.dailyTariff = dailyTariff;
    }

    public void setStatusKamar(StatusKamar status_kamar)
    {
        this.status_kamar = status_kamar;
    }

    public String toString()
    {
        String s =  "\nNama Hotel   : "+this.hotel.getNama()+
                "\nTipe Kamar   : "+this.getTipeKamar()+
                "\nHarga        : Rp"+this.dailyTariff+
                "\nStatus Kamar : "+this.status_kamar+
                "\n";

        if (status_kamar != StatusKamar.Vacant)
        {
            s +=    "Pelanggan    : "+ DatabasePesanan.getPesanan(this).getPelanggan().getNama()+"\n";
        }

        return s;
    }
}   