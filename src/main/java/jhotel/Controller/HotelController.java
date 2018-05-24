package jhotel.controller;
import jhotel.DatabaseHotel;
import jhotel.Hotel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

/**
 * Class HotelController
 *
 * @author Cakti Fadhillah
 * @version 1.20 - 24 Mei 2018
 * @since 25-04-18
 */

@RestController
public class HotelController {
    /**
     * method untuk mengatur server untuk Database Hotel.
     * @return hotels
     */
    @RequestMapping(value="/hotel", method = RequestMethod.GET)
    public ArrayList<Hotel> hotelList()
    {
        ArrayList<Hotel> hotels = DatabaseHotel.getHotelDatabase();
        return hotels;
    }

   /**
     * method untuk mengatur  server untuk pengambilan data hotel berdasarkan id dari hotel.
     *
     * @param id_hotel
     */

    @RequestMapping(value = "/getHotel/{id_hotel}", method = RequestMethod.GET)
    public Hotel getHotel(@PathVariable int id_hotel)
    {
        Hotel hotel1 = DatabaseHotel.getHotel(id_hotel);
        return hotel1;
    }
}