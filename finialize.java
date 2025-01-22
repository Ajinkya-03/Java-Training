public class finialize {
    public static void main(String[] args)
    {
        finialize ss = new finialize();
        ss = null;
        System.gc();
        System.out.println("main method end");
    }

    public void finallize()
    {
        System.out.println("i m in finalize");
    }
}
