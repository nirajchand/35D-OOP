package Tasks;
import java.util.Scanner;;
public class IfElseStatement {
    public static void main(String[] args) {
        // Simple if example
        // if (true) {
        //     System.out.println("True Statement");
        // }
        // If takes an expression with boolean value 
        int num1 = 56, num2 = 20 ;
        if (num1>num2) {
            System.out.println("Greater");
        }else{
            System.out.println("Lesser");
        }   

        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the value of first variable: ");
        // int a = scan.nextInt();
        // System.out.println("Enter the value of second variable: ");
        // int b = scan.nextInt();
        // if (a>b) {
        //     System.out.println("The First Number is greater.");
        // }else{
        //     System.out.println("The second number is greater.");
        // }


        // If else if, two comditions 
        if (num1==num2) {
            System.out.println("Equal");
        }else if (num1 > num2) {
            System.out.println("The Num1 is greater");
        }else{
            System.out.println("The num1 is less than num2");
        }
        // else should be at last and its not mandatory 

        // If else if ladder multiple conditions 
        if (num1 < 0) {
            System.out.println("Num1 is negative");
        }else if (num2 < 0) {
            System.out.println("NUm2 is Negative");
        }else if (num1 != num2) {
            System.out.println("Not equal");
        } else if (num1 > num2) {
            System.out.println("Num1 is greater");
        }else{
            System.out.println("Default statement");
        }
        // if cndition is matches it will skip all the remaining 
        // conditions including else, condition will be checked form top to buttom

        // Nested if condition 
        if (num1>0) {
            if (num1>num2) {
                System.out.println("Positive and greater");
            }else{
                System.out.println("Positive and lesser");
            }
        }else{
            if (num1>num2) {
                System.out.println("Negative and greater");
            }else{
                System.out.println("Negative and lesser");
            }
        }
        
    }
}
