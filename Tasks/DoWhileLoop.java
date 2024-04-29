package Tasks;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        // int num1 = 0;
        // while (num1<0) {
        //     System.out.println("While checks the condition first");
        // }

        // // do while checks the condition after first iteration
        // do{
        //     System.out.println("Do while checks the condition after");
        // }while(num1 < 0);
        // This means do while loop runs at least once 

        // Task:
        // Use a while loop to ask user for an int value 
        // if the user input positive value 
        // promt user to input negative value 
        // loop until the user input negative integer value 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the negative number");
        int num = scan.nextInt();
        while (num >= 0) {
            System.out.println("Enter the negative number");
            num = scan.nextInt();
        }
        System.out.println("ENd of the loop");
    }
}
