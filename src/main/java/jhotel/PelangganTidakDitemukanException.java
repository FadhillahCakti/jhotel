package jhotel;
import java.lang.Exception;

/**
 * Class PelangganTidakDitemukanException.
 *
 * @author Cakti Fadhillah
 * @version 1.10 - 24 Mei 2018
 */

public class PelangganTidakDitemukanException extends Exception {
    // instance variable
    private int pelanggan_error;

    /**
     * Constructor for objects of class PelangganTidakDitemukanException.
     * @param pelanggan_input dari pelanggan
     * 
     */

    public PelangganTidakDitemukanException (int pelanggan_input)
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
        return (super.getMessage() + pelanggan_error + " tidak ditemukan.");
    }
}