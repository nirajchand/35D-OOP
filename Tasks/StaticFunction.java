package Tasks;

public class StaticFunction {
    // in the following public and static is optional 
    public static int addTwoNumber(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static String vendingMachine(int menu){
        if (menu == 1) {
            return "Coke";
        }
        if (menu == 2) {
            return "Water";
        }
        if (menu == 3) {
            return "Frooti";
        }
        return "Nothing";
    }

    public static boolean checkeven (int num){
        boolean con = num%2 == 0;
        return con;
    }
    
    public static String checkEligible(int age , String name){
        if (age < 18) {
            return "Sorry " + name + ",You are not eligible";
        }else{
            return "congratulation " + name + ",You are eligible";
        }

    }
    public static void main(String[] args) {
        // if a function is static no need to make object 
        // if the function is static in same class you can simple call method 
        // int sumReturn = addTwoNumber(10, 30);
        // System.out.println("The sum is " + sumReturn);

        // String frooti = vendingMachine(3);
        // System.out.println("Frooti check " + frooti);


        // Task1 make a function checkeven 
        // that takes one int 
        // that returns a boolean 
        // if the int is even return true else false 

        // boolean check = checkeven(13);
        // System.out.println(check);

        // Task2 
        // make a function checkEligible
        // that takes one int age, one String name 
        // if the age is < 18 
        // return String"Sorry name, you are not eligible" 
        // else return "congratulation name, you are eligible"

        // String eligible = checkEligible(89, "rijan");
        // System.out.println(eligible);






        
    

    }
}
