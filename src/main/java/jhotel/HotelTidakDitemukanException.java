package jhotel;
import java.lang.Exception;

/**
 * Class HotelTidakDitemukanException.
 *
 * @author Cakti Fadhillah
 * @version 1.10 - 24 Mei 2018
 */


public class HotelTidakDitemukanException extends Exception
{
    // instance variable
    private int hotel_error;

    /**
     * Constructor for objects of class HotelTidakDitemukanException.
     * @param hotel_input dari hotel
     * 
     */

    public HotelTidakDitemukanException (int hotel_input)
    {
        super(" Hotel dengan ID: ");
        hotel_error = hotel_input;
    }

    /**
     * method getPesan
     * 
     * @return super getMessage, hotel_error dan toString
     */


    public String getPesan()
    {
        return (super.getMessage() + hotel_error + " tidak ditemukan.");
    }
}