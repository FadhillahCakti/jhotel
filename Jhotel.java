import javax.xml.crypto.Data;
import java.util.*;
import java.util.Date;
import java.util.regex.*;
import java.text.SimpleDateFormat;

public class Jhotel {
    public static void main(String[] args) {

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
        }


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
        };
    }

 
