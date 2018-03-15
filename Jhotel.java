public class Jhotel
{
    public void main(String[] args)
    {
        Hotel hotel1 = new Hotel ("Mangga Hotel", lokasi1, 1);
        Lokasi lokasi1 = new Lokasi (30,50,"Jl. Pisang");
        Customer customer1 = new Customer (10, "Rambutan");
        Room room1 = new SingleRoom (hotel1, "21", true, StatusKamar.Vacant);
        Pesanan pesanan1 = new Pesanan (customer1, room1);
        Administrasi administrasi1 = new Administrasi ();

        lokasi1.printData ();
        customer1.printData ();
        hotel1.printData ();

        administrasi1.pesananDitugaskan (pesanan1, room1);

        room1.printData ();
        pesanan1.printData ();

        if (room1 instanceof DoubleRoom)
        {
            System.out.println ("Benar Double Room");
        }
        else if (room1 instanceof SingleRoom)
        {
            System.out.println ("Salah, Bukan Double Room");
        }

        Room room2 = new DoubleRoom (hotel1, "25", true, StatusKamar.Booked)
        room2.setDailyTariff(15);
        Pesanan room2 = new Pesanan (customer1, room1);
        wa.setJumlahHari (12);

        administrasi1.pesananDitugaskan(wa,room2);
        wa.setBiaya();

        room2.printData();
        wa.printData();

        if (room2 instanceof DoubleRoom)
        {
            System.out.println ("Benar Double Room");
        }
        else if (room2 instanceof SingleRoom)
        {
            System.out.println ("Salah, Bukan Double Room");
        }
    }
    public Jhotel()
    {
        
    }
 
}
