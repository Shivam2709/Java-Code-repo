
public class Reverse_String{
    public static String reverse(String s) {
        char ch;
        String nstr ="";

        for(int i = 0; i< s.length(); i++ ){
            ch = s.charAt(i);
            nstr = ch+nstr;
        }
        return nstr;
    }
    public static void main(String args[]){
        String s = "Shivam";
        System.out.print(reverse(s));
    }
}