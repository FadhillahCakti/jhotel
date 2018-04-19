
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
        pesan.setBiaya();
        roomAmbilPesanan(kamar);
    }

    public void roomAmbilPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Booked);
    }

    public void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Vacant);
    }

    public void pesananDibatalkan(Room kamar)
    {
        kamar.getPesanan(kamar).setStatusSelesai(false);
        kamar.getPesanan(kamar).setStatusDiproses(false);
        roomLepasPesanan(kamar);
    }

    public void pesananSelesai(Room kamar)
    {
        kamar.getPesanan(kamar).setStatusSelesai(true);
        kamar.getPesanan(kamar).setStatusDiproses(false);
        roomLepasPesanan(kamar);
    }

    public void pesananDibatalkan(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());

        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
    }

    public void pesananSelesai(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());

        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
    }
}