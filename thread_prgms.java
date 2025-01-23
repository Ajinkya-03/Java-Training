class Mythread extends Thread {
    
    @Override

    public void run()
    {
        String s = Thread.currentThread().getName();
        System.out.println(s);

    }
}

public class thread_prgms
{
    public static void main(String[] args)
    {
        Mythread m1 = new Mythread();
        Mythread m2 = new Mythread();
        Mythread m3 = new Mythread();

        m1.setName("thread1");
        m2.setName("thread2");
        m3.setName("thread3");
        
        m1.start();
        m3.start();
        m2.start();
    }
}
