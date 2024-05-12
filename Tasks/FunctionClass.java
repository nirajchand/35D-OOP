package Tasks;
public class FunctionClass {

    // write a function inside a class 
    void printSomething(){
        System.out.println("This function prints");
    }
    // IN the function void means nothing/null 

    // with return type as int 
    int returnInteger(){
        int returnThis = 1;
        return returnThis;
    }
    // with return and params 
    boolean returnString(int num1, int num2){
        boolean check = num1 == num2;
        return check;
    }
    public static void main(String[] args) {
        // To use a function you need to make a object 
        // Note: just remember the syntax for now 
    
        FunctionClass fc = new FunctionClass();
        fc.printSomething();

        // you can call this function any time in need 
        fc.printSomething();
        // if a function has a type other void we can save it 
        int callIntFunction = fc.returnInteger();
        boolean callReturnString = fc.returnString(10, 20);
        System.out.println(callReturnString);
        System.out.println("Function with return Int " + callIntFunction);
    }
    
}
