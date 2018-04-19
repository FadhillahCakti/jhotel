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
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID = 0;
    /**
     * 
     * @param  Customer pelanggan baru yang akan dimasukkan
     * @return penambahan customer dengan tipe boolean 
     */
    public boolean addCustomer(Customer baru)
    {
        for (Customer var : CUSTOMER_DATABASE) 
        {
            if (var.getID() == baru.getID())
            {
                return false;
            }
        }
        LAST_CUSTOMER_ID = baru.getID();
        return CUSTOMER_DATABASE.add(baru);
    }
    
    /**
     * 
     *
     * @param  int id pelanggan yang akan dihapus
     * @return penghapusan customer dengan tipe boolean 
     */
    public boolean removeCustomer(int id)
    {
        for (Customer cust : CUSTOMER_DATABASE){
            if (cust.id == id){
                DatabasePesanan.removePesanan(cust);
                return CUSTOMER_DATABASE.remove(cust);
            }
        }
        return false;
    }
    
    public Customer getCustomer(int id)
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
     *
     * @return  Customer list_customer
     */
     public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }

}
