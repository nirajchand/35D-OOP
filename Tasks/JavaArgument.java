package Tasks;

public class JavaArgument {
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("Not enough args");
            return;
        }
        System.out.println("First args is " + args[0]);
        System.out.println("Second args is " + args[1]);
    }
}
