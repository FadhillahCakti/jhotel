import java.util.ArrayList;
/**
 * Class DatabaseCustomer.
 *
 * @author Cakti Fadhillah
 * @version 1.2
 * @since 10-3-18
 */
public class DatabaseCustomer
{
    // instance variable
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID = 0;

    /**
     * addCustomer method
     * method ini digunakan untuk menambahkan pelanggan ke database
     *
     * @param  customer pelanggan baru yang akan dimasukkan
     * @return boolean apakah penambahan customer sukses
     */
    public static boolean addCustomer(Customer baru) throws PelangganSudahAdaException
    {
        for (Customer var : CUSTOMER_DATABASE) {
            if (var.getID() == baru.getID() || var.getEmail().equals(baru.getEmail()))
            {
                throw new PelangganSudahAdaException(baru);
            }
        }

        LAST_CUSTOMER_ID = baru.getID();
        return CUSTOMER_DATABASE.add(baru);
    }

    /**
     * removeCustomer method
     * method ini digunakan untuk menghapus pelanggan dari data base
     *
     * @param  int id pelanggan yang akan dihapus
     * @return boolean apakah penghapusan customer sukes
     */
    public static boolean removeCustomer(int id) throws PelangganTidakDitemukanException
    {
        for (Customer cust : CUSTOMER_DATABASE){
            if (cust.id == id){
                try {
                    DatabasePesanan.removePesanan(cust);
                } catch (PesananTidakDitemukanException e) {
                    //TODO: handle exception
                    System.out.println("-Exception Pesanan Tidak Ditemukan-");
                    System.out.println(e.getPesan());
                }

                return CUSTOMER_DATABASE.remove(cust);
            }
        }

        throw new PelangganTidakDitemukanException(id);
        //return false;
    }

    public static Customer getCustomer(int id)
    {
        for (Customer cust : CUSTOMER_DATABASE){
            if (cust.id == id){
                return cust;
            }
        }
        return null;
    }

    public static int getLastCustomerID()
    {
        return LAST_CUSTOMER_ID;
    }

    /**
     * getCustomerDatabase method
     * method ini digunakan untuk mengambil database customer dari objek ini
     *
     * @return  Customer CUSTOMER_DATABASE
     */
    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }
}
