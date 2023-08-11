package String;

import java.util.Scanner;

public class Palindrome_String {
    public static void palindrome(String str) {
        int n = str.length()-1;

        String rev ="";
        for(int i=n; i>=0; i--){
            rev += str.charAt(i);
        }
        if( str.equals(rev)){
            System.out.println("Str is palindrome");
        }else{
            System.out.println("Str is not palindrome");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str =sc.nextLine();
        palindrome(str);
    }
}
