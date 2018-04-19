
/**
 * Enumerasi Class TipeKamar
 *
 * @author Cakti Fadhillah
 * @version 1.2
 * @since 10-3-18
 */
public enum TipeKamar
{
    //Single, Double, Premium;
    Single("Single"), Double("Double"), Premium("Premium");
    private String deskripsi;

    private TipeKamar(String s)
    {
        this.deskripsi = s;
    }

    public String  toString()
    {
        return this.deskripsi;
    }
}