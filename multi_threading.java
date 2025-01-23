class Mythread extends Thread{

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
public class multi_threading
{
    public static void main(String[] args)
    {
        Mythread m = new Mythread();
        m.start();
        for(int i=0; i<=5;i++)
        {
            System.out.println("MULTI THREAD");
        }
    }
}