package Tasks;
import java.util.Scanner;
// or
// import java.util 

public class InputOutput {
    public static void main(String[] args) {
        // User output 
        System.out.println("This sentance will have line break");
        // system.out.print 
        System.out.print("This will not have line break");
        System.out.print("This line will continue");
        // String formatting system.out.printf 
        // %s string, %d Integral, %f floating point, %b boolean 
        // This will also not break line 
        
        System.out.printf("Hello %s, good morning","world");
        System.out.printf("The number is %d ", 25);
        // can use multiple formatter 
        System.out.printf("\nThe floating %f and boolean %b\n",10.4f,false);

        // User input 
        // import java.util.scanner; // copy this line at the top of the code 
        
        // Scanner scan = new Scanner(System.in);
        // System.out.println("The following take whole senrence");
        // String wholeOutput = scan.nextLine();
        // System.out.println("The input taken is " + wholeOutput);
        // System.out.println("The folowing takes integer");
        // int intInput = scan.nextInt();
        // System.out.println("The input taken " + intInput);
        // System.out.println("The following take double");
        // double doubleInput = scan.nextDouble();
        // System.out.println("The input taken " + doubleInput);
        // System.out.println("The following takes boolean");
        // boolean booleanInput = scan.nextBoolean();
        // System.out.println("The input taken is " + booleanInput);
        // scan.close(); // you must close the scanner once all input is taken


        /*  Task 
        1) make a new scanner object scan1
        prompt the following and take input
        what is your name? save the input to string = name
        Are you over 18? save the input to boolean = status
        How many sibling ? save the input to integer = sibling 
        print the following 
        Hello name,
        Over 18?, status
        you have siblings number of siblings */

        // Scanner scan1 = new Scanner(System.in);
        // System.out.println("What is Your name?");
        // String name = scan1.nextLine();
        // System.out.println("My name is " + name);
        // System.out.println("Are you over 18");
        // boolean status = scan1.nextBoolean();
        // System.out.println("Over 18" + status);
        // System.out.println("How many siblings");
        // int sibling = scan1.nextInt();
        // System.out.println("The number of siblings are " + sibling );
        // scan1.close();

        


    }
}
