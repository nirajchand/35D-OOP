package Tasks;

public class MultiDimArrayLoop {
    public static void main(String[] args) {
        // creating an array with [4][2]
        int[][] arr = new int[4][2];
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[1][0] = -10;
        arr[1][1] = -20;
        arr[2][0] = 100;
        arr[2][1] = 200;
        arr[3][0] = -100;
        arr[3][1] = -200;
        // Visual representation
        // [
        //     [10,20],
        //     [-10,-20],
        //     [100,200],
        //     [-100,-200]
        // ]

        // Loop outer array 
        int outerLength = arr.length; // -> 4
        for(int outer = 0;outer < outerLength;outer++){
            System.out.println("Array in index " + outer);
            // System.out.println(arr[outer][0]);
            // System.out.println(arr[outer][1]);
            int innerArrayLength = arr[outer].length;
            for(int inner = 0; inner < innerArrayLength;inner++){
                System.out.println(arr[outer][inner]);//inner loops from 0,1
            }
        }

        // make an array of string names 
        // [
        //     ["sanskriti","Nikita","Anji"],
        //     ["Miraj","Niraj","Oskar"],
        // ]

        // Loop each names
        // Task2 on the same loop, the on which array is oskar in 
        // Answer should be 1
        String[][] names = new String[2][3];
        String[][] names = {
            {"sanskriti","Nikita","Anji"},
            {"Miraj","Niraj","Oskar"}
        };
        int namesLength = names.length;
        for(int outer = 0;outer<namesLength;outer++){
            System.out.println("Names in array " + outer);
            int innerLength = names[outer].length;
            for(int inner = 0;inner<innerLength;inner++){
                System.out.println(names[outer][inner]);
                if (names[outer][inner] == "Oskar") {
                    System.out.println("Oscar is in " + outer + "Array");
                }
            }
        }
        



    }
}
