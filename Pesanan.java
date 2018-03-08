/**
 *   Class Pesanan.
 *
 * @author Cakti Fadhillah
 * @version 1.2
 * @since 8-3-18
 */

public class Pesanan
{
    private double biaya;
    private Customer pelanggan;
    private String nama_pelanggan;
    private String Jenis_kamar;
    private boolean isdiproses;
    private boolean isselesai;
    
    /**
     * Constructor untuk Pesanan
     */
    public Pesanan (double biaya,Customer pelanggan){
        this.biaya = biaya;
        this.pelanggan = pelanggan;
    
    
    }
    
    /**
     * Menunjukkan biaya
     * @return Untuk mengassign biaya
     */

    public double getBiaya (){
    
        return biaya;
    }
    
    /**
     * Menunjukkan pelanggan
     * @return Untuk menambah pesanan dari pelanggan
     */
    public Customer getPelanggan(){

    
        return pelanggan;
    }
    
    /**
     * Menunjukkan status proses
     * @return Menampilkan status apakah true or false
     */

    public boolean getStatusDiproses ()
    {
        return isdiproses;
    } 
    
    /**
     * Menunjukkan status selesai
     * @return Menunjukkan status apakah selesai
     */
     public boolean getStatusSelesai (){
    
        return isselesai;
    } 
    
    /**
     * Menetapkan nilai biaya
     * @param biaya menerima biaya untuk memasukkan pada variabel
     */
    public void setBiaya (double biaya){
        
        this.biaya = biaya;
           
    }
    
    /**
     * Menetapkan pelanggan
     * @param baru untuk menambah customer baru
     */
    public void setPelanggan(Customer baru){
        
        pelanggan = baru;
        
    }
    
    /**
     * Menetapkan status pemrosesan
     * @param diroses Menetapkan status
     */
    public void setStatusDiproses(boolean diproses){
        
        isdiproses = diproses;
    }
    
    /**
     * Menetapkan status penyelesaian
     * @param selesai untuk menetapkan status selesai
     */
    public void setStatusSelesai(boolean selesai){
    
        isselesai = selesai;
        
    }
    
    /**
     * Menunjukkan nama
     * @return Untuk menampilkan nama
     */
    
    public String getNama(){
    
       return nama_pelanggan;
    
    }
    
    public void printData(){
         System.out.println(biaya);
        
    }
}
