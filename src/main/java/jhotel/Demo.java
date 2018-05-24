public class Demo extends Thread
{
    private Thread thread1;
    private String coba;


        public Demo (String coba)
        {
            this.coba = coba;
            System.out.println ("Inizialize" + coba);
        }

    public void run ()
    {
        System.out.println ("Hitung Mundur "+ coba);
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println (i+1);
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            System.out.println (coba + "Melakukan Interupsi");
        }
    }
    public void start ()
    {
        System.out.println ("Dimulai" + coba);
        if (thread1 == null)
        {
            thread1 = new Thread (this,coba);
            thread1.start();
        }
    }
}

