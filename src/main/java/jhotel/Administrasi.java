package jhotel;

/** 
 * Class Administrasi
 *
 * @author Cakti Fadhillah
 * @version 1.10 - 24 Mei 2018
 */

public class Administrasi
{//instance variable


	/**
     * Method dari pesananDitugaskan
     * Mengambil nilai return dari pesan
     * @param  Pesanan pesan dan Room kamar adalah parameter dari method ini
     * @return dua kemungkinan dari if statement yaitu perubahan nilai pesan setStatusSelesai,setStatusDiproses dan set.Room dibandingkan setStatus Aktif 
     */

    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        if (kamar.getStatusKamar().equals((StatusKamar.Vacant)))
        {
            pesan.setStatusSelesai(false);
            pesan.setStatusDiproses(true);
            pesan.setRoom(kamar);

        }
        else{
            pesan.setStatusAktif(false);
        }
    }

	/**
     * Method dari pesananDibatalkan
     * Mengambil niali return dari pesan
     * @param  Room kamar adalah parameter dari method ini
     * @return nilai Pesanan pesan bersama dengan nilai setStatusSelesai,setStatusDiproses, dan setStatus Aktif 
     */

    public static void pesananDibatalkan(Room kamar)
    {
        Pesanan pesan = DatabasePesanan.getPesananAktif(kamar);
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
    }
	/**
     * Method dari pesananSelesai
     * Mengambil niali return dari pesan dan kamar
     * @param  Room kamar adalah parameter dari method ini
     * @return nilai Pesanan pesan bersama dengan nilai setStatusSelesai,setStatusDiproses, setStatusKamar dan setStatus Aktif 
     */

    public static void pesananSelesai(Room kamar)
    {
        Pesanan pesan = DatabasePesanan.getPesananAktif(kamar);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        kamar.setStatusKamar(StatusKamar.Vacant);
    }
	/**
	* Method dari pesananDibatalkan
     * Mengambil niali return dari pesan
     * @param  Pesanan pesan adalah parameter dari method ini
     * @return nilai setStatusSelesai,setStatusDiproses, dan setStatus Aktif 
     */

    public static void pesananDibatalkan(Pesanan pesan)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
    }

	/**
	* Method dari pesananSelesai
     * Mengambil niali return dari pesan
     * @param  Pesanan pesan adalah parameter dari method ini
     * @return nilai setStatusSelesai, setStatusDiproses, dan setStatus Aktif 
     */

    public static void pesananSelesai(Pesanan pesan)
    {
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
    }
}