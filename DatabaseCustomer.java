/**
 *   Class DatabaseCustomer.
 *
 * @author Cakti Fadhillah
 * @version 1.2
 * @since 8-3-18
 */
public class DatabaseCustomer
{

   private String[] list_customer;
   
   /**
     * Menambah Customer
     * @param baru Customer baru 
     * @return Status Customer baru
     */
   
   public boolean addCustomer(Customer baru){

       
       return false;
    
    }
    
    /**
     * Menghapus customer
     * @param id Id dari pengguna yang akan dihapus
     * @return Status penghapusan
     */
    
   public boolean removeCustomer(int id){
    
       return false;
    
    }
    
    /**
     * Menunjukkan Customer database
     * @return String Menunjukkan nama customer
     */

   public String[] getCustomerDatabase(){
       
       return list_customer;
    
    }
}
