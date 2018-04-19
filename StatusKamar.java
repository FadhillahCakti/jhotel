
/**
 * Enumeration class StatusKamar
 *
 * @author Cakti Fadhillah
 * @version 1.2
 * @since 10-3-18
 */
public enum StatusKamar
{
    //Booked, Processed, Vacant;
    Booked("Booked"), Processed("Processed"), Vacant("Vacant");
    private String deskripsi;

    private StatusKamar(String s)
    {
        this.deskripsi = s;
    }

    public String  toString()
    {
        return this.deskripsi;
    }
}