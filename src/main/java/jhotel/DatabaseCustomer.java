package jhotel;
import java.util.ArrayList;

/**
 * Class DatabaseCustomer.
 *
 * @author Cakti Fadhillah
 * @version 1.2 - 24 Mei 2018
 */

public class DatabaseCustomer
{//instance variable

    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
    private static int LAST_CUSTOMER_ID = 0;

	/**
     * Konstruktor dari Class DatabaseCustomer
     */

    public static ArrayList<Customer> getCustomerDatabase(){
        return CUSTOMER_DATABASE;
    }

	/**
     * Method dari getLastCustomerID
     * Mengambil nilai return dari LAST_CUSTOMER_ID
     * 
     * @return LAST_CUSTOMER_ID
     */

    public static int getLastCustomerID() {
        return LAST_CUSTOMER_ID;
    }

	/**
     * Method dari addCustomer denagn throws dari PelangganSudahAdaException
     * Mengambil nilai return dari CUSTOMER_DATABASE dan LAST_CUSTOMER_ID
     * 
     * @return for LAST_CUSTOMER_ID
     */

    public static boolean addCustomer(Customer baru) throws PelangganSudahAdaException
    {
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if(cust.getID() == baru.getID())
                throw new PelangganSudahAdaException(baru);
            else if(cust.getEmail()==baru.getEmail())
                throw new PelangganSudahAdaException(baru);
        }

        CUSTOMER_DATABASE.add(baru);
        LAST_CUSTOMER_ID = baru.getID();
        return true;
    }

	/**
     * Method dari getCustomer
     * Mengambil nilai return dari CUSTOMER_DATABASE 
     * 
     * @return for dan if statement CUSTOMER_DATABASE
     */

    public static Customer getCustomer(int id)
    {
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if (cust.getID() == id) return cust;
        }
        return null;
    }

	/**
     * Method dari getCustomerLogin
     * Mengambil nilai return dari CUSTOMER_DATABASE 
     * @param Parameter dari method ini String email dan String password
     * @return for dan if statement CUSTOMER_DATABASE
     */

    public static Customer getCustomerLogin(String email, String password){
        for (Customer cust : CUSTOMER_DATABASE) {
            if (cust.getEmail().equals(email)  && cust.getPassword().equals(password)) {
                return cust;
            }
        }
        return null;
    }

	/**
     * Method dari removeCustomer denagn throws dari PelangganTidakDitemukanException
     * Mengambil nilai return dari CUSTOMER_DATABASE 
     * 
     * @return for dan if statement dengan throw dari CUSTOMER_DATABASE
     */

    public static boolean removeCustomer(int id) throws PelangganTidakDitemukanException {
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if(cust.getID()==id){
                for (Pesanan pesan :
                        DatabasePesanan.getPesananDatabase()) {
                    if(pesan.getPelanggan().equals(cust)) {
                        try{
                            DatabasePesanan.removePesanan(pesan);
                        }
                        catch(PesananTidakDitemukanException e){

                        }
                    }
                }
                CUSTOMER_DATABASE.remove(cust);
                return true;
            }
        }
        throw new PelangganTidakDitemukanException(id);
    }

}