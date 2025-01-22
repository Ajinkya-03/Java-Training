import java.util.Scanner;

public class Multiples {
    public static void main(String[] args)
    {

        int user;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        user = sc.nextInt();
        
        for(int i = 1; i<=10; i++)
        {
            System.out.println(user + " x " + i + " = " + user * i);
        }
        sc.close();
    }
}