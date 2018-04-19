
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

    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);
        pesan.setBiaya();
        roomAmbilPesanan(kamar);
    }

    public static void roomAmbilPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Booked);
    }

    public static void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Vacant);
    }

    public static void pesananDibatalkan(Room kamar)
    {
        DatabasePesanan.getPesanan(kamar).setStatusSelesai(false);
        DatabasePesanan.getPesanan(kamar).setStatusDiproses(false);
        roomLepasPesanan(kamar);
    }

    public static void pesananSelesai(Room kamar)
    {
        DatabasePesanan.getPesanan(kamar).setStatusSelesai(true);
        DatabasePesanan.getPesanan(kamar).setStatusDiproses(false);
        roomLepasPesanan(kamar);
    }

    public static void pesananDibatalkan(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());

        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        pesan.setStatusAktif(false);
    }

    public static void pesananSelesai(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());

        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
    }
}