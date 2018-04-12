
/** 
 * Class Administrasi
 *
 * @author Cakti Fadhillah
 * @version 1.2
 * @since 10-3-18
 */
public class Administrasi
{
    public Administrasi()
    {

    }

    public void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);

        roomAmbilPesanan(pesan, kamar);
    }

    public void roomAmbilPesanan(Pesanan pesan, Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Booked);
        kamar.setPesanan(pesan);
    }

    public void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Vacant);
        kamar.setPesanan(null);
    }

    public void pesananDibatalkan(Room kamar)
    {
        kamar.getPesanan().setStatusSelesai(false);
        kamar.getPesanan().setStatusDiproses(false);
        kamar.setPesanan(null);

        roomLepasPesanan(kamar);
    }

    public void pesananSelesai(Room kamar)
    {
        kamar.getPesanan().setStatusSelesai(true);
        kamar.getPesanan().setStatusDiproses(false);
        kamar.setPesanan(null);

        roomLepasPesanan(kamar);
    }

    public void pesananDibatalkan(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());

        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
    }

    public void pesananSelesai(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());

        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
    }
}