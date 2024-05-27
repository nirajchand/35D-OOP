package Tasks;

public class ArrayLoop {
    // public static int arrayFinder(String[]arr, String find){
    //     int len = arr.length;
    //     for(int i = 0; i < len; i++){
    //         if (arr[i] == find) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    
    public static int[] addToArray(int[]intarray, int value){
        int length = intarray.length;
        int [] newarray = new int[length];
        for(int i = 0; i<length;i++){
            newarray[i]= value + intarray[i];
        }
        return newarray;
    }

    public static void main(String[] args) {
        // int[] data = {10, 20, 30, 40, 50};
        // int arrayLength = data.length;
        // first apporach 
        // for(int index = 0; index < arrayLength; index ++){
        //     System.out.println("Index" + index + "Value" + data[index]);
        // }
        // System.out.println("Using length - 1");
        // Second approach 
        // for(int index = 0; index <= arrayLength-1; index ++){
        //     System.out.println("Index" + index + "Value" + data[index]);
        // }
        // data[100]; this will crash, no index accessible

        // Task 
        // make an array of the length 10 
        // add the values as 10, 20, 30, 40, 50, 60, 70, 80,90,100 
        // make another array with the same length 10 
        // add the value of first array in negative onto second array
        // use loop on first array to complate this 
        // second array should be -10,-20 .....,-100
        // print the second array 

        // int[] firstArray = {10,20,30,40,50,60,70,80,90,100};
        // int[] secondArray = new int[10];
        // for(int i = 0; i < 10; i++){
        //     secondArray[i] = -(firstArray[i]);
        //     System.out.println(firstArray[i] +"\t"+ secondArray[i] );
        // }


        // Task 
        // print the second array in descending 
        // should be: -100,-90, -80, ....., -10
        // Note: start loop from (length -1) to 0
        // int len = secondArray.length;
        // for(int i = len-1; i>0; i--){
        //     System.out.println(secondArray[i]);
        // }
        // System.out.println(len);


        // Make a function named array finder 
        // that takes array of string and string finder 
        // return the index if found else return -1 

        // String[] arr = {"niraj","prajesh","rijan"};
        // String find = "niraj";
        // int a = arrayFinder(arr, find);
        // System.out.println(a);

        // Make a functiont addToArray
        // that takes an array of int, int value 
        // loop array of int and add the value to each element 
        // returns array of int of new value 
        // Eg. [1,2,3,4] , 10 
        // returns [11,12,13,14] 

        int[] intarray = {1,2,3,4};
        int value = 10;
        int[] result = addToArray(intarray, value);
        System.out.println(result[2]);

        // Make a function reverseArray 
        // Takes array of int 
        // return new array of reversed index 
        

        

    }
}
