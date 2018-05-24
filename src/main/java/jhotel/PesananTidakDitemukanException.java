package jhotel;
import java.lang.Exception;

/**
 * Class PesananTidakDitemukanException.
 *
 * @author Cakti Fadhillah
 * @version 1.10 - 24 Mei 2018
 */

public class PesananTidakDitemukanException extends Exception {
    // instance variable
    Customer pelanggan_error;

    /**
     * Constructor for objects of class PesananTidakDitemukanException.
     * @param pelanggan_input dari pesanan
     * 
     */

    public PesananTidakDitemukanException (Customer pelanggan_input)
    {
        super(" Pesanan yang dipesan oleh: ");
        pelanggan_error = pelanggan_input;
    }

   /**
     * method getPesan
     * 
     * @return super getMessage, pelanggan_error dan toString
     */


    public String getPesan()
    {
        return (super.getMessage() + pelanggan_error.getNama() + " tidak ditemukan.");
    }
}