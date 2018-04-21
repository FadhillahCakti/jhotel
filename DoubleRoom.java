
/**
 * Write a description of class DoubleRoom here.
 *
 * @author Cakti Fadhillah
 * @version 1.2
 * @since 15-03-2018
 */
public class DoubleRoom extends Room
{
    private Customer customer2;
    private static final TipeKamar TIPE_KAMAR = TipeKamar.Double;

    public DoubleRoom(Hotel hotel, String nomor_kamar)
    {
        super(hotel, nomor_kamar);
    }

    @Override
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }

    public Customer getCustomer2()
    {
        return this.customer2;
    }

    public void setCustomer2(Customer customer2)
    {
        this.customer2 = customer2;
    }
}