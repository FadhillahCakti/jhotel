import java.util.ArrayList;
/**
 *Class DatabasePesanan.
 *
 * @author Cakti Fadhillah
 * @version 1.2
 * @since 10-3-18
 */
public class DatabasePesanan
{
    private ArrayList<Pesanan> list_pesanan;
    /**
     * 
     * @param  Pesanan pesanan baru yang ditambahkan ke daftar
     * @return Penambahan pesanan ke daftar 
     */
    public boolean addPesanan(Pesanan baru)
    {
        return list_pesanan.add(baru);
    }
    
    /**
     * 
     *
     * @param  Pesanan pesanan baru yang dihapuskan ke daftar
     * @return Penghapusan pesanan ke daftar
     */
    public boolean removePesanan(Pesanan pesan)
    {
        return list_pesanan.remove(pesan);
    }
    
    /**
     * 
     *
     * @param  Customer pelanggan dengan pesanan diambil dari daftar
     * @return pesanan pesanan yang dipesan oleh customer param
     */
    public Pesanan getPesanan(Customer cust)
    {
        for (Pesanan var : list_pesanan) {
            if (var.getPelanggan().equals(cust)) {
                return var;
            }
        }
        return null;
    }
    
    /**
     *
     * @return  Pesanan[] list_customer
     */
    public ArrayList<Pesanan> getPesananDatabase()
    {
        return list_pesanan;
    }
    
    /**
     * 
     * @param  Pesanan pesanan yang akan dibatalkan
     */
    public void pesananDibatalkan(Pesanan pesan)
    {
        
    }
}
