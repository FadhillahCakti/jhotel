import java.util.*;
import java.util.Date;
import java.util.regex.*;
import java.text.SimpleDateFormat;



/**
 * Class Customer.
 *
 * @author Cakti Fadhillah
 * @version 1.2
 * @since 10-3-18
 */
public class Customer
{
    // instance variables
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;
    protected String password;

    public Customer(String nama, int tanggal, int bulan, int tahun, String email)
    {
        // initialise instance variables
        this.id = DatabaseCustomer.getLastCustomerID() + 1;
        this.nama = nama;
        this.dob = dob;
        setEmail(email);
        this.password = password;
    }

    public Customer(String nama, Date dob, String email)
    {
        // initialise instance variables
        this.id = DatabaseCustomer.getLastCustomerID() + 1;
        this.nama = nama;
        this.dob = dob;
        setEmail(email);
        this.password = password;
    }

    /**
     * getID method
     * mengambil nilai id pada objek ini
     *
     * @return  int id pelanggan
     */
    public int getID()
    {
        return this.id;
    }

    /**
     * getNama method
     * mengambil nama pada objek ini
     *
     * @return  String nama
     */
    public String getNama()
    {
        return this.nama;
    }

    public String getEmail()
    {
        return this.email;
    }

    public Date getDob()
    {
        return this.dob;
    }

    public void setDob(Date dob)
    {
        this.dob = dob;
    }

    public void setEmail(String email)
    {
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);

        if (matcher.find())
        {
            this.email = email;
        }
    }

    /**
     * setID method
     * Set id pelanggan untuk objek ini
     *
     * @param  int id pelanggan
     */
    public void setID(int id)
    {
        this.id = id;
    }

    /**
     * setNama method
     * set nama pelanggan untuk objek ini
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

    public String toString()
    {
        SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy");

        String s =  "\nCustomer ID    : "+this.id+
                "\nName           : "+this.nama+
                "\nE-Mail         : "+this.email+
                "\nDate of Birth  : "+format.format(this.dob)+
                "\n";

        if (DatabasePesanan.getPesananAktif(this) != null)
        {
            s += "Booking order is in progress\n";
        }

        return s;
    }
}
