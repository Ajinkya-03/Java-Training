class Mythread implements Runnable{

    @Override
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("HELLO THERE");
        }
        System.out.println("--------------------");
        int c = 10+4;
        System.out.println(c);

        System.out.println("--------------------");

        int c1 = 10-4;
        System.out.println(c1);
        System.out.println("--------------------");
    }

}
public class thread_class
{
    public static void main(String[] args)
    {
        Mythread mt = new Mythread();
        
        Thread t = new Thread(mt);
        t.start();

        for(int i=0; i<=5;i++)
        {
            System.out.println("MULTI THREAD");
        }
    }
}