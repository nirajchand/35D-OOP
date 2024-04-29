package Tasks;

import java.util.TimerTask;

public class Variable {
    // Instance variable
    // Will need object to access this variable
    // Not shared between the object

    int instanceVariable = 100;
    // Static/class variable
    // No needed of object,can be called from class
    // shared between the objects

    static int staticVariable = 20;
    
    // Non primitive data type
    // Declaration
    byte byteValue;
    // Initialization
    byteValue = 100;
    // Decleration and Initialization
    short shortValue = 200;
    // Multiple Declaration
    int intvalue1, intvalue2;
    intvalue1 = 10000;
    intvalue2 = 2000;
    // Multiple Declaration and Initialization
    long longval1 = -9000, longval2 = 9000;
    float floatvalue = 90.90f; //the letter 'f' is needed
    double doublevalue = 100.897d; //The letter 'd' if optional
    char charvalue = 'c'; //must use single quote '
    boolean booleanValue = false;
    // Illegal actions below
    // byte bytevalue = 100; // we cannot redeclare the variable
    // byteValue = 200; // instead use reassignment
    // boolean boolval2 = 'false'; // cannot use different type
    // byte byteValue = 1000000; cannot exceed min and max 

    // Non primitive data type
    String stringValue = "This is a string value";
    // Using class
    String stringValue2 = new String("This string uses class");
    System.out.println(stringValue2);
    // Object, for this we can use the same public class mode
    Variable variableobject = new Variable();
    // Use object from the above to access instance variable
    System.out.println(variableobject,instanceVariable);
    // use class to use static variable
    System.out.println(Variable.staticVarible);

    // Type casting
    int intValueType = 100;
    double intValueConvertedToDouble = intValueType;
    // Automatically cast from lowdatatype to high datatype

    // explicit casting 
    double doubleValueType = 190.8109;
    int doubleValueCOnvertedToInt = (int) doubleValue;
    // Manually specify data type for eg. (int) */
    // Note this type cast can only be done in primitive data type 

    //Task
    // Make one double variable called doubleVar1 = 1000.12
    // Explicitly cast the variable into float, floatVar1
    // Explicitily cast the floatVar1 into int, intVar1
    // Make a string varivale with "The integer is"
    // print the string variable and print the int variable in another

    double doubleVar1 = 1000.12;
    float floatVar1 = (float) doubleVar1;
    int intVar1 = (int) floatVar1;
    String info = "The integer is";
    System.out.println(info);
    System.out.println(intVar1);
}