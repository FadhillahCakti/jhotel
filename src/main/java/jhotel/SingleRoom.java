package jhotel;
/**
 * Class SingleRoom
 *
 * @author Cakti Fadhillah
 * @version 1.10 - 24 Mei 2018
 */
public class SingleRoom extends Room
{
    // instance variables 
    private static TipeKamar TIPE_KAMAR=TipeKamar.Single;

    /**
     * Constructor dari class SinglerRoom
     */
    public SingleRoom(Hotel hotel, String nomor_kamar)
    {
        super(hotel, nomor_kamar);
    }

    /**
     * getTipeKamar method
     * mengambil Tipe Kamar pada objek ini
     *
     * @return TIPE_KAMAR
     */
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }

}