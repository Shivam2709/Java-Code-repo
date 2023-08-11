package Important_Problem;
import java.util.Scanner;

public class Reverse_String {
    public static void reverseString(String str) {

        String rev="";
        int n = str.length();

        for(int i = n-1;i>= 0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String str = sc.nextLine();
        reverseString(str);
    }
}
