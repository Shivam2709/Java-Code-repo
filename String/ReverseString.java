package String;
import java.util.Stack;

public class ReverseString {
    static String reverse(String str){
        int n = str.length()-1;
        String rev ="";

        for(int i = n; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        return rev;
    }

    static void ReverseUsingStack(String str){
        int n = str.length();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i< n; i++){
            st.push(str.charAt(i));
        }
        String ch = "";
        for(int i =0; i< n; i++){
             ch = ch + st.pop();

        }
        System.out.println(ch);
    }
    public static void main(String[] args) {
        String str = "ziuQskeeG";
        System.out.println(reverse(str));
        ReverseUsingStack(str);


    }
}
