// public class exception_handling1 {
//     public static void main(String[] args)
//     {
//         System.out.println(10/0);
//     } 
// }                                        //exception without throw block


class test
{
    public static void main(String[] args)
    {
        throw new ArithmeticException("\by zero");

        //we cannot write any SOPln statement after the throw block it will not get print/executed
    }
}

//throw is always used in method
//throws keyword is used at methid final