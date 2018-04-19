
/**
 * Write a description of class SingleRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SingleRoom extends Room
{
    private static final TipeKamar TIPE_KAMAR = TipeKamar.Single;

    public SingleRoom(Hotel hotel, String nomor_kamar)
    {
        super(hotel, nomor_kamar);
    }

    @Override
    public TipeKamar getTipeKamar() 
    {
        return TIPE_KAMAR;
    }
}