package jhotel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


/**
 * Class RoomController
 *
 * @author Cakti Fadhillah
 * @version 1.10 - 24 Mei 2018
 */
@RestController
public class RoomController {
   /**
     * method untuk mengatur server untuk mengambil database room.
     */
    @RequestMapping(value="/vacantrooms", method = RequestMethod.GET)
    public ArrayList<Room> vacantRooms(){
        ArrayList<Room> dbRoom = DatabaseRoom.getVacantRooms();
        return dbRoom;
    }

    /**
     * method untuk mengatur server untuk mengambil detail room berdasarkan id room.
     *
     * @param id_hotel
     * @param nomor_kamar
     */

    @RequestMapping(value="/room/{id_hotel}/{nomor_kamar}", method = RequestMethod.GET)
    public Room getRoom(@PathVariable int id_hotel,
                        @PathVariable String nomor_kamar){
        Room room = DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel), nomor_kamar);
        return room;
    }
}