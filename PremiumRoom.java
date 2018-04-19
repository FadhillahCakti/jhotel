
/**
 * Write a description of class PremiumRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumRoom extends Room
{
    private static final double DISCOUNT = 0.3;
    private static final TipeKamar TIPE_KAMAR = TipeKamar.Premium;

    public PremiumRoom(Hotel hotel, String nomor_kamar)
    {
        super(hotel, nomor_kamar);
    }

    @Override
    public TipeKamar getTipeKamar() 
    {
        return TIPE_KAMAR;
    }

    public double getDiscount()
    {
        return DISCOUNT;
    }

    public void setDailyTariff(double dailyTariff)
    {
        this.dailyTariff = dailyTariff * (1- DISCOUNT);
    }
}