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

    /**
     * Constructor for objects of class Customer
     * @param int id pelanggan
     * @param String nama pelanggan
     */
    public Customer(int id, String nama)
    {
        // initialise instance variables
        this.id = id;
        this.nama = nama;
    }

    public Customer(int id, String nama, int tanggal, int bulan, int tahun)
    {
        // initialise instance variables
        this.id = id;
        this.nama = nama;
        this.dob = new GregorianCalendar(tahun, bulan, tanggal).getTime();
    }

    public Customer(int id, String nama, Date dob)
    {
        // initialise instance variables
        this.id = id;
        this.nama = nama;
        this.dob = dob;
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
        Pattern pattern = Pattern.compile("/[a-z]{2}\\-[0-9]{3}", 5);
        Matcher matcher = pattern.matcher("aa098hkasjdh786sda sdb76ads");

        while (matcher.find())
        {
            System.out.println(matcher.group()+"");
        }

        this.email = email;
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

        return s;
    }}
