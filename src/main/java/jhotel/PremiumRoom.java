package jhotel;
/**
 * Class PremiumRoom
 *
 * @author Cakti Fadhillah
 * @version 1.10 - 24 Mei 2018
 */
public class PremiumRoom extends Room
{//instance Variable
    private static double DISCOUNT=0.3;
    private static TipeKamar TIPE_KAMAR = TipeKamar.Double;

	/**
     * Konstruktor dari Class PremiumRoom
     */
    public PremiumRoom(Hotel hotel, String nomor_kamar)
    {
        super(hotel, nomor_kamar);
    }

	/**
     * Method dari getTipeKamar
     * Mengambil nilai return dari TIPE_KAMAR
     * 
     * @return TIPE_KAMAR
     */
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }


    	/**
     * Method dari setDailyTariff
     * Set nilai return dari DailyTariff di kelas Super PremiumRoom
     * 
     * @return dailyTariff Kamar
     */
     public void setDailyTariff(double dailyTariff)
    {
        super.setDailyTariff(dailyTariff*DISCOUNT);
    }
}