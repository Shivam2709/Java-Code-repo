package String;

import java.util.Scanner;

public class Reverse_Sentences {
    public static void Reverse_sen(String str) {
        str += " ";
        String rev="", word ="";
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch!=' '){
                word += ch;
            }else{
                rev = word +" "+ rev;
                word="";
            }
        }
        System.out.println(rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence");
         String str = sc.nextLine();
         Reverse_sen(str);
    }
}
