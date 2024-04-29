package Tasks;

public class OperatorClass {
    public static void main(String[] args) {
        // Arthemitic Operators
        int a = 10, b = 20;
        int sum = a + b; // Here the '+' is arthematic operator
        System.out.println("Addition for a+b is" + sum);
        System.out.println("Difference for a-b is" + (a-b));
        System.out.println("Multiplication for a*b is " + (a*b));
        System.out.println("Division for a/b is" + (a/b));
        System.out.println("Module for a and b isn " + (a%2));

        // Assignment operators
        int aNumber1;
        aNumber1 = 10;
        // Or declare and assign
        int aNumber2 = 20;
        // assign with another variable 
        int aNumber3 = aNumber1;
        System.out.println("Assignment with += " + (aNumber1+=10));
        aNumber2 -= 30; //same as aNumber2 = aNumber2 - 30;
        System.out.println("Assignment with -= " + aNumber2 );

        // Relational operators 
        int rNumber1 = 10, rNumber2 = 20;
        System.out.println("rNumber1 equals to rNumber2? " + (rNumber1 == rNumber2));
        System.out.println("rNumber greater Than rNumber2" + (rNumber1> rNumber2));
        System.out.println("rNumber1 is lessthan or equal to rNumber2?" +  (rNumber1<=rNumber2));
        System.out.println("rNumber1 is Not equal to rNumber2?" + (rNumber1!=rNumber2));

        // Logical operators 
        int lNumber1 = 10, lNumber2 = 20;
        boolean lExpression1 = lNumber1 ==lNumber2;
        boolean lExpression2 = lNumber1 <= lNumber2;
        System.out.println("And operator uses &&" + (lExpression1&&lExpression2));
        System.out.println("Or operator uses || " + (lExpression1||lExpression2) );
        System.out.println("NOt operator uses !" + !lExpression1);

        // Unary Operator 
        int uNumber1 = 10;
        uNumber1++; // meaning uNumebr1 = uNumber1 + 1;
        System.out.println("Unary for increament is ++" + uNumber1);
        uNumber1--;
        System.out.println("Unary for decreament is --" + uNumber1);

        // Ternary Operator 
        int tNumber1 = 10, tNumber2 = 10;
        boolean tExpression = tNumber1 == tNumber2;

        // One line if else, see the given example in if else
        // string output
        // if (tExpression == true){
            // output = "true ststement"; 
        // }else{
            // output = "False statement";
        // }

        String output = tExpression ? "True Statement" : "False Statement";
        // Here we can assign a string out with one expression 
        // if expression is true it will return the value after the "?" 
        // if the expression is false it will return the value after the ":" 

        int numberOutput = tNumber1 < tNumber2 ? 10 : 20;
        System.out.println(output);
        System.out.println(numberOutput);


        // Task1
        // Write a program to print weather a variable is a greater or equal to 18
        a = 8;
        System.out.println("The number is greater than 18" + (a >=0));
        System.out.println("The number is equal to 18" + (a == 10));

        // Write a program to print simple interest form variable 
        // Make 3 variable for amount, time and rate and save the calculation into a variable 
        int p = 10, T = 2, R = 12;
        float si = (p*T*R/100);
        System.out.println("The simple interest is " + si);

    //    write a program to print area and perimeter of rectnagle 
    int l = 10, B = 20 ;
    System.out.println("Area of rectange is " + (l * B));
    System.out.println("Perimeter of rectangle is " + (2*(l*B)));

    // complete the task1 using ternary operators 
    int c = 10, d = 18;
    boolean Niraj = c>=d;
    String out = Niraj ? "True statement" : "False statement ";
    System.out.println(out);
        }
    
}
