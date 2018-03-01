/**
 * Write a description of class Pesanan here.
 *
 * @author Cakti Fadhillah
 * @version 0.0.
 */
public class Pesanan
{
    // instance variables - replace the example below with your own
    private double biaya;
    private Customer pelanggan;
    private String nama_pelanggan;
    private String jenis_kamar;
    private boolean isDiproses;
    private boolean isSelesai;

    /**
     * Constructor for objects of class Pesanan
     */
    public Pesanan()
    {
        
    }

    /**
     * getBiaya method
     *
     * @param  
     * @return    biaya pesanan
     */
    public double getBiaya()
    {
     return biaya; 
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  
     * @return    pelanggan/Customer
     */
    public Customer getPelanggan()
    {
        // put your code here
        return pelanggan;
    }
    
    /**
     * getStatusDiproses method
     *
     * @param  
     * @return    status diproses/isDiproses
     */
    public boolean getStatusDiproses()
    {
        // put your code here
        return statusdiproses;
    }
    
    /**
     * getStatusSelesai method
     *
     * @param  
     * @return    status selesai/isSelesai
     */
    public boolean getStatusSelesai()
    {
        return statusselesai;// put your code here
        
    }
    
    /**
     * setBiaya method
     *
     * @param  biaya    biaya
     * @return    
     */
    public void setBiaya(double biaya)
    {
        this.biaya = biaya;// put your code here
   }
    
    /**
     * getPelanggan method
     *
     * @param  pelanggan Customer
     * @return    
     */
    public void getPelanggan(Customer pelanggan)
    {
        return pelanggan;
    }
    
    /**
     * setStatusDiproses method
     *
     * @param
     */
    public void setStatusDiproses(boolean diproses)
    {
        this.statusdiproses = statusdiproses;
    }
    
    /**
     * setStatusSelesai method
     *
     * @param  status selesai
     */
    public void setStatusS
