package Tasks;

public class PrefixPostfix {
    public static void main(String[] args) {
        int prefixValue = 10;
        // note that the value changes in same line  
        System.out.println(++prefixValue);
        System.out.println(prefixValue);
        int postFix = 20;
        // Note that the value doesnt change in the same line 
        System.out.println(postFix++);
        System.out.println(postFix);
    }
}
