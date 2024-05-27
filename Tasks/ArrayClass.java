package Tasks;
public class ArrayClass {
    public static void main(String[] args) {
        // To create an array define datatype followed by [] 
        int[] myFirstArray;
        // Initializing the array we need new reference 
        myFirstArray = new int[6]; //here the new int[6] = 6 refers to the size of the array
        // the size of an array can be futher access by length 
        int myFirstArrayLength = myFirstArray.length;
        System.out.println("MY first array size is " + myFirstArrayLength);

        // Using index for an array operation 
        myFirstArray[0] = 10;
        myFirstArray[1] = 30;
        myFirstArray[2] = 100;

        // To print the array use the same index 
        System.out.println("The first index is in 0 index " + myFirstArray[0]);
        // can also create a new int value 
        int secondArrayIndex = myFirstArray[1];
        System.out.println("The second element stored " + secondArrayIndex);

        // Declaration, Initialization and value assign 
        int[] myThirdArray = {10,20,30,0,100};
        // or using constructor 
        int[] myFourthArray = new int[]{1,2,3,4};
    

        // Task 
        // Create a array of int called myFifth array 
        // with size of 5 
        // insert the value of 10, 20, 30, 40, 50 
        // print the value of array as well as the multiplied by 2 
        // Eg:
        // 10 20
        // 20 40
        // 30 60 
        // 40 80 
        // 50 100 

        int[] myFifthArray = {10,20,30,40};
        for(int i=0;i<5;i++){
            System.out.println(myFifthArray[i] +"\t"+ myFifthArray[i]*2);
        }

    }

}
