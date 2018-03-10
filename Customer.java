/**
 * Class Customer.
 *
 * @author Cakti Fadhillah
 * @version 1.2
 * @since 10-3-18
 */
public class Customer
{
    protected int id;
    protected String nama;
    /**
     * @param int id dari Customer
     * @param String dari nama Customer
     */
    public Customer(int id, String nama)
    {
        this.id = id;
        this.nama = nama;
    }

    /**
     * 
     * @return  int id pelanggan
     */
    public int getID()
    {
        return id;
    }
    
    /**
     * 
     * @return  String nama
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     *
     * @param  int id pelanggan
     */
    public void setID(int id)
    {
        this.id = id;
    }
    
     /**
     * 
     *
     * @param  String Nama pelanggan
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }

     /**
     * PrintData method
     *
     * method ini akan mencetak nama pelanggan di console
     */
    public void printData()
    {
        System.out.println("Customer");
        System.out.println("ID : "+ this.id);
        System.out.println("Nama : "+ this.nama);
    }
}
