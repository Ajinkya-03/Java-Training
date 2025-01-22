//we caannot call finalize method more than 2 time in same method

public class finalize_once {
    static finalize_once s;
    
        public static void main(String[] args) throws InterruptedException
        {
            finalize_once a =new finalize_once();
            System.out.println(a.hashCode());
            a=null;
            System.gc();
            Thread.sleep(5000);

            System.out.println(s.hashCode());
            s=null;
            System.gc();
            Thread.sleep(10000);
            System.out.println("main thread");

        }
    }
         public void finallize()
        {
             System.out.println("i m in finalize");
        }
    
