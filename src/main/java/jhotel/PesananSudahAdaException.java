package jhotel;
import java.lang.Exception;

/**
 * Class PesananSudahAdaException.
 *
 * @author Cakti Fadhillah
 * @version 1.10 - 24 Mei 2018
 */

public class PesananSudahAdaException extends Exception {
    // instance variable
    private Pesanan pesanan_error;

    /**
     * Constructor for objects of class PesananSudahAdaException.
     * @param pesanan_input dari pesanan
     * 
     */

    public PesananSudahAdaException (Pesanan pesanan_input)
    {
        super(" Pesanan yang dipesan oleh: ");
        pesanan_error = pesanan_input;
    }

    /**
     * method getPesan
     * 
     * @return super getMessage, pesanan_error dan toString
     */

    public String getPesan()
    {
        return (super.getMessage() + pesanan_error.getPelanggan().getNama() + " sudah melakukan pemesanan.");
    }
}