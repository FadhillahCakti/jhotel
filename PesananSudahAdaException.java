import java.lang.Exception;
public class PesananSudahAdaException extends Exception
{
    private Customer pesanan_error;

    public PesananSudahAdaException (Customer pesanan_input)
    {
        super ("Pesanan yang dipesan oleh :");
        pesanan_error= pesanan_input;
    }
    public String getPesan()
    {
        return super.getMessage() + pesanan_error.getNama() + " sudah melakukan pemesanan.";
    }
}
