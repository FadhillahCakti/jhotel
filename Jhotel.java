import javax.xml.crypto.Data;
import java.util.*;
import java.util.Date;
import java.util.regex.*;
import java.text.SimpleDateFormat;

public class Jhotel {


    public Jhotel()
    {

    }

    private static void perhubungan()
    {
        try {
            DatabaseHotel.addHotel(new Hotel("Pisang", new Lokasi(10, 20, "Jl. Merapi"), 3));
            DatabaseHotel.addHotel(new Hotel("Jambu", new Lokasi(20, 30, "Jl. Kawi"), 3));
            DatabaseHotel.addHotel(new Hotel("Pisang", new Lokasi(10, 20, "Jl. Merapi"), 3));
            DatabaseHotel.addHotel(new Hotel("Salak", new Lokasi(40, 20, "Jl. Singgalang"), 3));

            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotelDatabase().get(0), "1"));
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotelDatabase().get(1), "2"));
            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotelDatabase().get(2), "3"));
            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotelDatabase().get(3), "4"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotelDatabase().get(0), "5"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotelDatabase().get(0), "6"));

            DatabaseRoom.getRoomDatabase().get(0).setDailyTariff(1000000.0);
            DatabaseRoom.getRoomDatabase().get(1).setDailyTariff(1000000.0);
            DatabaseRoom.getRoomDatabase().get(2).setDailyTariff(1250000.0);
            DatabaseRoom.getRoomDatabase().get(3).setDailyTariff(1250000.0);
            DatabaseRoom.getRoomDatabase().get(4).setDailyTariff(1500000.0);
            DatabaseRoom.getRoomDatabase().get(5).setDailyTariff(1500000.0);

            DatabaseCustomer.addCustomer(new Customer("Saktia Oktapyani", new GregorianCalendar(1995, 10, 1).getTime(), "oktapyanisaktia@jkt48.com"));
            DatabaseCustomer.addCustomer(new Customer("Shania Junianatha", new GregorianCalendar(1998, 6, 27).getTime(), "junianathashania@jkt48.com"));
            DatabaseCustomer.addCustomer(new Customer("Sinka Juliani", new GregorianCalendar(1996,7,4).getTime(), "julianisinka@jkt48.com"));
            DatabaseCustomer.addCustomer(new Customer("Aninditha Rahma Cahyadi", new GregorianCalendar(1999,5,1).getTime(), "rahmacaninditha@jkt48.com"));
            DatabaseCustomer.addCustomer(new Customer("Lidya Maulida Djuhandar", new GregorianCalendar(1996, 8, 17).getTime(), "maulidadlidya@jkt48.com"));
            DatabaseCustomer.addCustomer(new Customer("Ratu Vienny Fitrilya", new GregorianCalendar(1996,2,23).getTime(), "viennyfratu@jkt48.com"));
            DatabaseCustomer.addCustomer(new Customer("Shani Indira Natio", new GregorianCalendar(1998,10,5).getTime(), "indiranshani@jkt48.com"));
            DatabaseCustomer.addCustomer(new Customer("Shania Gracia", new GregorianCalendar(1999,8,31).getTime(), "graciashinta@jkt48.com"));
            DatabaseCustomer.addCustomer(new Customer("Shinta Naomi", new GregorianCalendar(1994,6,4).getTime(), "naomishinta@jkt48.com"));
            DatabaseCustomer.addCustomer(new Customer("Adhisty Zara", new GregorianCalendar(2003,6,3).getTime(), "zaraadhisty@jkt48.com"));
            DatabaseCustomer.addCustomer(new Customer("Fidly Immanda Azzahra", new GregorianCalendar(2001, 3, 19).getTime(), "immandaafidly@jkt48.com"));
            DatabaseCustomer.addCustomer(new Customer("Kato Rena", new GregorianCalendar(1997,10,7).getTime(), "renakato@gmail.com"));

            DatabasePesanan.addPesanan(new Pesanan(2, DatabaseCustomer.getCustomer(1)));
            DatabasePesanan.addPesanan(new Pesanan(2, DatabaseCustomer.getCustomer(2)));
            DatabasePesanan.addPesanan(new Pesanan(2, DatabaseCustomer.getCustomer(3)));
            DatabasePesanan.addPesanan(new Pesanan(2, DatabaseCustomer.getCustomer(4)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Lokasi Pisang = new Lokasi(10, 20, "Jl. Merapi");
        perhubungan();

        System.out.println("-------------TES EXCEPTION--------------------\n");
        try {
            DatabasePesanan.addPesanan(new Pesanan(2, DatabaseCustomer.getCustomer(1)));
        } catch (PesananSudahAdaException e) {
            System.out.println("-Exception Pesanan Sudah Ada-");
            System.out.println(e.getPesan() + "\n");
        }

        try {
            DatabaseCustomer.addCustomer(new Customer("Sinka Juliani", new GregorianCalendar(1996, 7, 4).getTime(), "julianisinka@jkt48.com"));
        } catch (PelangganSudahAdaException e) {
            System.out.println("-Exception Pelanggan Sudah Ada-");
            System.out.println(e.getPesan() + "\n");
        }

        try {
            DatabaseHotel.addHotel(new Hotel("Pisang", Pisang, 3));
            DatabaseHotel.addHotel(new Hotel("Pisang", Pisang, 3));
        } catch (HotelSudahAdaException e) {
            System.out.println("-Exception Hotel Sudah Ada-");
            System.out.println(e.getPesan() + "\n");
        }

        try {
            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotelDatabase().get(2), "3"));
        } catch (RoomSudahAdaException e) {
            System.out.println("-Exception Room Sudah Ada-");
            System.out.println(e.getPesan() + "\n");
        }

        try {
            DatabasePesanan.removePesanan(DatabaseCustomer.getCustomer(8));
        } catch (PesananTidakDitemukanException e) {
            System.out.println("-Exception Pesanan Tidak Ditemukan-");
            System.out.println(e.getPesan() + "\n");
        }

        try {
            DatabaseCustomer.removeCustomer(0);
        } catch (PelangganTidakDitemukanException e) {
            System.out.println("-Exception Pelanggan Tidak Ditemukan-");
            System.out.println(e.getPesan() + "\n");
        }

        try {
            DatabaseRoom.removeRoom(DatabaseHotel.getHotel(3), "2");
        } catch (RoomTidakDitemukanException e) {
            System.out.println("-Exception Room Tidak Ditemukan-");
            System.out.println(e.getPesan() + "\n");
        }

        try {
            DatabaseHotel.removeHotel(12);
            DatabaseHotel.removeHotel(12);
        } catch (HotelTidakDitemukanException e) {
            System.out.println("-Exception Hotel Tidak Ditemukan-");
            System.out.println(e.getPesan() + "\n");
        }

        System.out.println("-------------HASIL--------------------\n");
        for (Customer var : DatabaseCustomer.getCustomerDatabase()) {
            System.out.println(var);
        }

        for (Hotel var : DatabaseHotel.getHotelDatabase()) {
            System.out.println(var);
        }

        for (Room var : DatabaseRoom.getRoomDatabase()) {
            System.out.println(var);
        }

        for (Pesanan var : DatabasePesanan.getPesananDatabase()) {
            System.out.println(var);
        }

        /*
        System.out.println("Contoh");
        DatabaseCustomer.addCustomer(new Customer("A", new GregorianCalendar().getTime()));
        DatabaseCustomer.addCustomer(new Customer("B", new GregorianCalendar().getTime()));
        DatabaseCustomer.addCustomer(new Customer("C", new GregorianCalendar().getTime()));

        for (Customer var :DatabaseCustomer.getCustomerDatabase())
        {
            System.out.println(var.toString());
        }
        DatabaseHotel.addHotel(new Hotel("D", new Lokasi (10,11,"Jl.Pisang"), 3));
        DatabaseHotel.addHotel(new Hotel("E", new Lokasi (10,11,"Jl.Pisang"), 3));
        DatabaseHotel.addHotel(new Hotel("F", new Lokasi (10,11,"Jl.Pisang"), 3));

        for (Hotel var2 :DatabaseHotel.getHotelDatabase())
        {
            System.out.println(var2.toString());
        }

        DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1),"1"));
        DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(2),"2"));
        DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(3),"3"));


        for (Room var3 :DatabaseRoom.getRoomDatabase())
        {
            System.out.println(var3.toString());
        }

        DatabasePesanan.addPesanan (new Pesanan(1,DatabaseCustomer.getCustomer(1)));
        DatabasePesanan.addPesanan (new Pesanan(1,DatabaseCustomer.getCustomer(2)));
        DatabasePesanan.addPesanan (new Pesanan(1,DatabaseCustomer.getCustomer(3)));

        for (Pesanan var4 :DatabasePesanan.getPesananDatabase())
        {
            System.out.println(var4.toString());
        }

        Administrasi.pesananDitugaskan(DatabasePesanan.getPesanan(1),DatabaseRoom.getRoomDatabase().get(0));
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesanan(2),DatabaseRoom.getRoomDatabase().get(1));
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesanan(3),DatabaseRoom.getRoomDatabase().get(2));

        for (Pesanan var5 :DatabasePesanan.getPesananDatabase())
        {
            System.out.println(var5.toString());
        }/*


        /*Lokasi lokasi1 = new Lokasi (30,50,"Jl. Pisang");
        Hotel hotel1 = new Hotel ("Mangga Hotel", lokasi1, 1);
        Customer customer1 = new Customer (10, "Rambutan", new GregorianCalendar().getTime());
        Room room1 = new SingleRoom (hotel1, "21", true, StatusKamar.Vacant);
        Pesanan pesanan1 = new Pesanan (1,customer1, room1);
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

        Room room2 = new DoubleRoom (hotel1, "25", true, StatusKamar.Booked);
        room2.setDailyTariff(15);
        Pesanan pesanan2 = new Pesanan (1,customer1, room1);
        pesanan2.setjumlahHari (12);

        administrasi1.pesananDitugaskan(pesanan2,room2);


        room2.printData();
        pesanan2.printData();

        if (room2 instanceof DoubleRoom)
        {
            System.out.println ("Benar Double Room");
        }
        else if (room2 instanceof SingleRoom)
        {
            System.out.println ("Salah, Bukan Double Room");
        }
    System.out.println (customer1.toString());*/
    }

    ;

}
