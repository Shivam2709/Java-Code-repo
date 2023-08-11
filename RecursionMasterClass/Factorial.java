package RecursionMasterClass;

public class Factorial {
    public static int facto(int n){
        //Termination condition
        if(n <= 1)
            return 1;
        // Logic and recursive
        return n* facto(n-1);
    }
    public static void main(String[] args) {
        System.out.println(facto(5));
    }
}
