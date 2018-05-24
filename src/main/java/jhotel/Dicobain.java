public class Dicobain
{
    public static void main (String [] args)
    {
        Thread thread_1 = new Thread ("Thread 1");
        Thread thread_2 = new Thread ("Thread 2");
        Thread thread_3 = new Thread ("Thread 3");
        thread_1.start();
        thread_2.start();
        thread_3.start();

        try {
            int a = 1/0;
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
