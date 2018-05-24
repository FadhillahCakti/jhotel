package jhotel;
/**
 * Class Customer.
 *
 * @author Cakti Fadhillah
 * @version 1.10 - 24 Mei 2018
 */

import java.util.*;
import java.util.Date;
import java.util.regex.*;
import java.text.SimpleDateFormat;

public class Customer
{
    // instance variables
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;
    private String password;
    SimpleDateFormat dobformat = new SimpleDateFormat("dd MM yyyy");

	/**
     * Konstruktor pertama dari Class Customer
     */
    public Customer(String nama, int tanggal, int bulan, int tahun, String email, String password)
    {
	   // Inisialisasi instance variable
        this.id = DatabaseCustomer.getLastCustomerID()+1;
        this.nama = nama;
        this.email=email;
        this.dob = new GregorianCalendar(tahun,bulan-1,tanggal).getTime();
        this.password=password;
    }

	/**
     * Konstruktor kedua dari Class Customer
     */

    public Customer(String nama,Date dob, String email, String password)
    {
	   // Inisialisasi instance variable
        this.id = DatabaseCustomer.getLastCustomerID()+1;
        this.nama = nama;
        this.dob = dob;
        this.email=email;
        this.password=password;
    }

    /**
     * getID method
     * mengambil nilai id pada objek ini
     *
     * @return id pelanggan
     */
    public int getID()
    {
        return id;
    }

    /**
     * getNama method
     * mengambil nama pada objek ini
     *
     * @return nama pelanggan
     */
    public String getNama()
    {
        return nama;
    }

    /**
     * getEmail method
     * mengambil email pada objek ini
     *
     * @return email pelanggan
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * getDOB method
     * mengambil Date pada objek ini
     *
     * @return Date DOB
     */
    public Date getDOB()
    {
       return dob;
    }

    /**
     * getPassword method
     * mengambil password pada objek ini
     *
     * @return password pelanggan
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * setID method
     * Set id pelanggan pada objek ini
     *
     * @return id pelanggan 
     */
    public void setID(int id)
    {
        this.id = id;
    }

    /**
     * setNama method
     * Set nama pelanggan pada objek ini
     *
     * @return nama pelanggan 
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }

    /**
     * setEmail method
     * Set email pelanggan pada objek ini dengan if statement
     *
     * @return email pelanggan 
     */
    public void setEmail(String email){
        if (email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
            System.out.println("Email valid");
            this.email = email;
        }
        else {
            System.out.println("Email tidak valid");
        }
    }

    /**
     * setDOB method
     * Set Date DOB pelanggan pada objek ini
     *
     * @return date DOB 
     */
    public void setDOB(Date dob)
    {
        this.dob=dob;
    }

    /**
     * setPassword method
     * Set password pelanggan pada objek ini
     *
     * @return password pelanggan 
     */
    public void setPassword( String password)
    {
        this.password=password;
    }

    /**
     * String toString method
     * Menampilkan if statement dari return
     *
     * @return isi constructor kelass Customer 
     */
    public String toString()
    {
        if(DatabasePesanan.getPesananAktif(this ) != null){
            return "\nCustomer\n"
                    + "ID\t: " +getID()
                    + "\nNama\t: "+getNama()
                    +"\nE-mail\t: "+getEmail()
                    +"\nDate of birth\t: "+ dobformat.format(getDOB()) + "\nBooking order is on process";
        }
        return "\nCustomer\n"
                + "Customer ID\t: " +getID()
                + "\nNama\t: "+ getNama()
                +"\nE-mail\t: "+ getEmail()
                +"\nDate of birth\t: "+ dobformat.format(getDOB());

    }
}