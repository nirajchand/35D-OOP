package Tasks;

public class ForLoop {
    public static void main(String[] args) {
        // Use for loop when condition is fixed
        // for(int index = 0; index < 5; index ++){
        //     System.out.println("Loop running" +index);
        // } 

        // // Decrement loop 
        // for(int index = 10; index >=0 ; index --){
        //     System.out.println("Loop running" +index);
        // } 

        // int i = 2;
        // for(int index = 1; index < 11 ; index ++){
        //     System.out.printf("%d * %d = %d\n ", i,index,i*index);
        // }

        // Nested loop 
        // for (int outer = 0; outer < 3; outer ++){
        //     for(int inner = 2; inner >= 0; inner --){
        //         System.out.println("Inner " + inner);
        //     }
        //     System.out.println("Outer" + outer);
        // }
        
        for(int i = 1; i <=10;i ++){
            System.out.println("Multiplication table of " + i );
            for(int j = 1; j<=10; j ++){
                System.out.println(i + " X " + j + "= " + i*j);
            }
            System.out.print("\n");
        }
    }
}
