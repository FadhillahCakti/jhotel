package jhotel;
import java.lang.Exception;

/**
 * Class HotelSudahAdaException.
 *
 * @author Cakti Fadhillah
 * @version 1.10 - 24 Mei 2018
 */

public class HotelSudahAdaException extends Exception
{
    // instance variable
    private Hotel hotel_error;

    /**
     * Constructor for objects of class HotelSudahAdaException.
     * @param hotel_input dari hotel
     * 
     */

    public HotelSudahAdaException (Hotel hotel_input)
    {
        super ("Hotel dengan nama :");
        hotel_error= hotel_input;
    }

     /**
     * method getPesan
     * 
     * @return super getMessage, hotel_error dan toString
     */
    public String getPesan()
    {
        return (super.getMessage() + hotel_error.getNama() + " sudah terdaftar.");
    }
}
