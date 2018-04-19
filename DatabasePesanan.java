import java.util.ArrayList;
import java.util.Scanner;
/**
 *Class DatabasePesanan.
 *
 * @author Cakti Fadhillah
 * @version 1.2
 * @since 10-3-18
 */

public class DatabasePesanan
{
    // instance variables - replace the example below with your own
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<Pesanan>();
    private static int LAST_PESANAN_ID = 0;

    /**
     * addPesanan method
     * menambahkan pesanan pada database
     *
     * @param  Pesanan pesanan baru yang akan di tambahkan ke database
     * @return boolean apakah penambahan ke database sukses
     */
    public static boolean addPesanan(Pesanan baru)
    {
        if (getPesananAktif(baru.getPelanggan()) != null)
        {
            return false;
        }
        else
        {
            LAST_PESANAN_ID = baru.getID();
            return PESANAN_DATABASE.add(baru);
        }
    }
    
    /**
     * removePesanan method
     * method untuk menghapus pesanan pada database
     *
     * @param  Pesanan pesanan yang ingin dihapuskan dari database
     * @return boolean apakah penghapusan pesanan dari database sukses
     */
    public static boolean removePesanan(Pesanan pesan)
    {
        if (pesan.getStatusDiproses())
        {
            Administrasi.pesananDibatalkan(pesan);
        }
        return PESANAN_DATABASE.remove(pesan);
    }
    
    /**
     * getPesanan method
     * accessor objek ini untuk variable pesanan pada pesanan_list
     *
     * @param  Customer pelanggan yang pesanannya ingin diambil dari database
     * @return pesanan pesanan yang dipesan oleh customer param
     */
    public static Pesanan getPesananAktif(Customer pelanggan)
    {
        for (Pesanan var : PESANAN_DATABASE) {
            if (var.getPelanggan().equals(pelanggan)) {
                if (var.getStatusAktif())
                {
                    return var;
                }
                else
                {
                    break;
                }
            }
        }
        return null;
    }

    public static Pesanan getPesanan(int id)
    {
        for (Pesanan var : PESANAN_DATABASE) {
            if (var.getID() == id) {
                return var;
            }
        }
        return null;
    }
    
    public static Pesanan getPesanan(Room kamar)
    {
        for (Pesanan var : PESANAN_DATABASE) {
            if (var.getRoom().equals(kamar)) {
                return var;
            }
        }
        return null;
    }

    public static void removePesanan(Customer pelanggan)
    {
        for (Pesanan var : PESANAN_DATABASE) {
            if (var.getPelanggan().equals(pelanggan)) {
                removePesanan(var);
            }
        }
    }
    
    /**
     * getPesananDatabase method
     * accessor objek ini untuk variable PESANAN_DATABASE
     *
     * @return  Pesanan[] list_customer
     */
    public static ArrayList<Pesanan> getPesananDatabase()
    {
        return PESANAN_DATABASE;
    }

    public static int getLastPesananID()
    {
        return LAST_PESANAN_ID;
    }
}
