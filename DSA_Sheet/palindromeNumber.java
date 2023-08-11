package DSA_Sheet;

public class palindromeNumber {
    static void palidrome(int n) {
        int temp = n;
        int rev = 0;
        while ( temp != 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp /10;
        }

        if( n == rev ) {
            System.out.println("Number is Palidrome");
        }else {
            System.out.println("Not a Palindrome Number");
        }

    }
    public static void main(String[] args) {
        int n = 16461;
        palidrome(n);
    }
}
