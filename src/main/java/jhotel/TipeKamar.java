package jhotel;
/**
 * Enumerasi TipeKamar
 *
 * @author Cakti Fadhillah
 * @version 1.10 - 24 Mei 2018
 */
public enum TipeKamar
{

    Single("Single"),Double("Double"),Premium("Premium");
    private final String type;


    private TipeKamar(String type)

    {
        this.type = type;
    }


    public String toString()
    {
        return this.type;
    }

}