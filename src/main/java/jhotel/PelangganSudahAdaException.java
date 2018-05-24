package jhotel;
import java.lang.Exception;

/**
 * Class PelangganSudahAdaException.
 *
 * @author Cakti Fadhillah
 * @version 1.10 - 24 Mei 2018
 */

public class PelangganSudahAdaException extends Exception {
    // instance variable
    private Customer pelanggan_error;

    /**
     * Constructor for objects of class PelangganSudahAdaException.
     * @param pelanggan_input dari pelanggan
     * 
     */

    public PelangganSudahAdaException (Customer pelanggan_input)
    {
        super(" Data Customer dengan ID: ");
        pelanggan_error = pelanggan_input;
    }

    /**
     * method getPesan
     * 
     * @return super getMessage, pelanggan_error dan toString
     */

    public String getPesan()
    {
        return (super.getMessage() + pelanggan_error + " sudah terdaftar.");
    }
}