package DSA_Sheet;

public class ReverseNumber {
    static int Reverse(int n) {
        int rev = 0;
        while (n != 0){
            int rem = n % 10;
            rev = rev * 10 + rem ;
            n = n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(Reverse(n));
    }
}
