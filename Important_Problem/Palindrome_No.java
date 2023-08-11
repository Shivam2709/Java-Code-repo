package Important_Problem;
import java.util.Scanner;

public class Palindrome_No {
    public static void palindrome(int x) {

        int n = x;
        int result =0;
        while(n != 0) {
            int remainder = n % 10;
            result = result * 10 + remainder;
            n = n / 10;
        }
        if(x == result){
            System.out.println("This is a palindrome Number");
        }else{
            System.out.println("This is not a palindrome Number");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        palindrome(n);
    }
}
