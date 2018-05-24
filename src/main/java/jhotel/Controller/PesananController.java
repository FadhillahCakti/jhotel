package jhotel;
import org.springframework.web.bind.annotation.*;
import java.util.*;

/**
 * Class PesananController
 *
 * @author Cakti Fadhillah
 * @version 1.10 - 24 Mei 2018
 */

@RestController
public class PesananController {

    @RequestMapping(value = "/pesanancustomer/{id_customer}", method = RequestMethod.GET)
    public Pesanan pesananCust(@PathVariable int id_customer)
    {
        Pesanan pesan = DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer));
        return pesan;
    }

    /**
     * method untuk mengatur server untuk mengambil pesanan berdasarkan id pesanan.
     *
     * @param id_pesanan
     */

    @RequestMapping(value = "/pesanan/{id_pesanan}", method = RequestMethod.GET)
    public Pesanan getPesanan(@PathVariable int id_pesanan)
    {
        Pesanan pesan = DatabasePesanan.getPesanan(id_pesanan);
        return pesan;
    }

   /**
     * method untuk mengatur  server untuk melakukan pesanan oleh customer.
     *
     * @param jumlah_hari
     * @param id_customer
     * @param id_hotel
     * @param nomor_kamar
     */

    @RequestMapping(value = "/bookpesanan", method = RequestMethod.POST)
    public Pesanan buatPesanan(@RequestParam(value="jumlah hari") int jumlah_hari,
                               @RequestParam(value="id customer") int id_customer,
                               @RequestParam(value="id hotel") int id_hotel,
                               @RequestParam(value="nomor kamar") String nomor_kamar) {
        Pesanan pesanan = new Pesanan(jumlah_hari, DatabaseCustomer.getCustomer(id_customer));
        try {
            DatabasePesanan.addPesanan(pesanan);
            Administrasi.pesananDitugaskan(
                    DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer)),
                    DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel), nomor_kamar));

            Pesanan aktif = DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer));
            return aktif;
        }
        catch(PesananSudahAdaException ex) {
            ex.getMessage();
            return null;
        }
    }
   /**
     * method untuk mengatur server untuk melakukan cancel pesanan berdasarkan id pesanan.
     *
     * @param id_pesanan
     */

    @RequestMapping(value = "/cancelpesanan", method = RequestMethod.POST)
    public Pesanan cancelPesanan(@RequestParam(value="id pesanan") int id_pesanan){
        Administrasi.pesananDibatalkan(DatabasePesanan.getPesanan(id_pesanan));
        return DatabasePesanan.getPesanan(id_pesanan);
    }

    /**
     * method untuk mengatur server untuk menyelesaikan pesanan berdasarkan id pesanan.
     *
     * @param id_pesanan
     */

    @RequestMapping(value = "/finishpesanan", method = RequestMethod.POST)
    public Pesanan finishPesanan(@RequestParam(value="id pesanan") int id_pesanan){
        Administrasi.pesananSelesai(DatabasePesanan.getPesanan(id_pesanan));
        return DatabasePesanan.getPesanan(id_pesanan);
    }
}