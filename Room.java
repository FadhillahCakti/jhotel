
/**
 * Class Room
 *
 * @author Cakti Fadhillah
 * @version 1.2
 * @since 10-3-18
 */
public abstract class Room
{
    private Hotel hotel;
    private String nomor_kamar;
    private boolean isAvalable;
    protected double dailyTariff;
    private StatusKamar status_kamar;
    private Pesanan pesan;
    
    public Room(Hotel hotel, String nomor_kamar, boolean isAvalable, StatusKamar status_kamar)
    {
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.isAvalable = isAvalable;
        this.dailyTariff = dailyTariff;
        this.status_kamar = status_kamar;
        this.pesan = pesan;
    }

    public Hotel getHotel()
    {
        return this.hotel;
    }

    public String getNomorKamar()
    {
        return this.nomor_kamar;
    }

    public boolean getStatusAvailable()
    {
        return this.isAvalable;
    }

    public double getDailyTariff()
    {
        return this.dailyTariff;
    }


    public StatusKamar getStatusKamar()
    {
        return this.status_kamar;
    }

    public Pesanan getPesanan()
    {
        return this.pesan;
    }

    public abstract TipeKamar getTipeKamar ();

    public void setHotel(Hotel hotel)
    {
        this.hotel = hotel;
    }

    public void setNomorKamar(String nomor_kamar)
    {
        this.nomor_kamar = nomor_kamar;
    }

    public void setStatusAvailable(boolean isAvalable)
    {
        this.isAvalable = isAvalable;
    }

    public void setDailyTariff (double dailyTariff)
    {
        this.dailyTariff = dailyTariff;
    }

    public void setStatusKamar(StatusKamar status_kamar)
    {
        this.status_kamar = status_kamar;
    }

    public void setPesanan(Pesanan pesan)
    {
        this.pesan = pesan;
    }
    public void printData()
    {
        System.out.println("Room");
        System.out.println("Nama Hotel : "+ this.hotel.getNama());
        System.out.println("Nomor Kamar : "+ this.nomor_kamar);
        System.out.println("Tersedia : "+ this.isAvalable);
        System.out.println("Daily Tariff : Rp."+ this.dailyTariff);
        System.out.println("Status kamar : "+ this.status_kamar);
        System.out.println("Tipe kamar : "+ this.getTipeKamar());
    }

    public String toString()
    {
        String s =  "\nNama Hotel   : "+this.hotel.getNama()+
                    "\nTipe Kamar   : "+this.getTipeKamar()+
                    "\nHarga        : "+this.dailyTariff+
                    "\nStatus Kamar : "+this.status_kamar+
                    "\n";

        if (!isAvalable)
        {
            s +=    "Pelanggan      : "+this.pesan.getPelanggan().getNama()+"\n";
        }
        
        return s;
    }
}   