package jhotel;
/**
 * Class DoubleRoom.
 *
 * @author Cakti Fadhillah
 * @version 1.10 - 24 Mei 2018
 */
public class DoubleRoom extends Room
{
    // instance variables - replace the example below with your own
    private Customer customer2;
    private static TipeKamar TIPE_KAMAR= TipeKamar.Double;
    /**
     * Constructor for objects of class DoubleRoom
     */
    public DoubleRoom(Hotel hotel, String nomor_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar);
    }

   /** getCustomer2 method
     * mengambil nilai customer2
     *
     * @return customer2
     */
    public Customer getCustomer2()
    {
        return customer2;
    }

   /** TipeKamar method
     * mengambil nilai TipeKamar
     *
     * @return TIPE_KAMAR
     */
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }


    /**
     * SetCustomer2 method
     *
     * @param customer2 objek customer2
     */
    public void setCustomer2(Customer customer2)
    {
        this.customer2=customer2;
    }



}