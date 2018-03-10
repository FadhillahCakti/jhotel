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
    private ArrayList<Customer> list_customer;

    /**
     * 
     * @param  Customer pelanggan baru yang akan dimasukkan
     * @return penambahan customer dengan tipe boolean 
     */
    public boolean addCustomer(Customer baru)
    {
        return list_customer.add(baru);
    }
    
    /**
     * 
     *
     * @param  int id pelanggan yang akan dihapus
     * @return penghapusan customer dengan tipe boolean 
     */
    public boolean removeCustomer(int id)
    {
        for (Customer cust : list_customer){
            if (cust.id == id){
                return list_customer.remove(cust);
            }
        }
        return false;
    }
    
    /**
     *
     * @return  Customer list_customer
     */
    public ArrayList<Customer> getCustomerDatabase()
    {
        return list_customer;
    }
}
