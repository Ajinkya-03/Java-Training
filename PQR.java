interface ABC
{
    default void mi()
    {
        System.out.println("i in ABC");
    };
}

interface XYZ 
{
    default void m1()
    {
        System.out.println("i am in XYZ");
    }
}

public class PQR implements ABC,XYZ
{
    public static void main(String[] args)
    {
        PQR p = new PQR();
        p.m1();
    }
    @Override
    public void m1()
    {
        XYZ.super.m1();
    }
}
