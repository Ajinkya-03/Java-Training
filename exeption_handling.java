
public class exeption_handling {
    public static void main(String[] args)
        {
            int a=10;
            int b=0;
            try
            {
                int c=a/b;
                System.out.println(c);
            }
            catch(ArithmeticException e)
            {
                System.out.println("Arithemetic Exception");
            }
            finally
            {
                System.out.println("hello there");
            }
        }
    }

    //finally block is always used wth the try-catch(try) blocks