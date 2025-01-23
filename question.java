import java.util.Scanner;

public class question {
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) 
        {
            array[i] = scanner.nextInt();
        }
        
        int firstLarge;
        int secondLarge;
        firstLarge = secondLarge = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) 
        {
            if (array[i] > firstLarge) 
            {
                secondLarge = firstLarge;
                firstLarge = array[i];
            } 
            else if (array[i] > secondLarge && array[i] != firstLarge)
            {
                secondLarge= array[i];
            }
        }
        
        if (secondLarge == Integer.MIN_VALUE) 
        {
            System.out.println("There is no second largest element.");
        } 
        else 
        {
            System.out.println("The second largest element is: " + secondLarge);
        }
    }
}
