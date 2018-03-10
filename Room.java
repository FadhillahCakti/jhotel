
/**
 * Class Room
 *
 * @author Cakti Fadhillah
 * @version 1.2
 * @since 10-3-18
 */
public class Room
{
    private Hotel hotel;
    private int id;
    private String nomor_kamar;
    private boolean isAvalable;
    private Customer customer;
    private double dailyTariff;
    private StatusKamar status_kamar;
    private Pesanan pesan;
    
    public Room(Hotel hotel, String nomor_kamar, boolean isAvalable, Customer customer, double dailyTariff
    , StatusKamar status_kamar)
    {
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.isAvalable = isAvalable;
        this.customer = customer;
        this.dailyTariff = dailyTariff;
        this.status_kamar = status_kamar;
    }

    public Hotel getHotel()
    {
        return this.hotel;
    }

    public int getID()
    {
        return this.id;
    }

    public String getNomorKamar()
    {
        return this.nomor_kamar;
    }

    public boolean getStatusAvailable()
    {
        return this.isAvalable;
    }

    public Customer getCustomer()
    {
        return this.customer;
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

    public void setHotel(Hotel hotel)
    {
        this.hotel = hotel;
    }

    public void setID(int id)
    {
        this.id = id;
    }

    public void setNomorKamar(String nomor_kamar)
    {
        this.nomor_kamar = nomor_kamar;
    }

    public void setStatusAvailable(boolean isAvalable)
    {
        this.isAvalable = isAvalable;
    }

    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }

    public void setDailyTariff(Double dailyTariff)
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
        System.out.println("Pelanggan : "+ this.customer.getNama());
        System.out.println("Harga : "+ this.dailyTariff);
        System.out.println("Status kamar : "+ this.status_kamar);
    }
}   