package Important_Problem;
import java.util.Scanner;

public class Palindrome_String {
    public static void palindrome_string(String str) {

        String rev="";
        int n = str.length();

        for(int i = n-1;i>= 0;i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Entered string is palindrome");
        }else{
            System.out.println("Entered string is not palindrome");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String str = sc.nextLine();
        palindrome_string(str);
    }
}
