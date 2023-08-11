package String;

public class SkipString {
    static String stringSkip(String str){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("apple") ){
            return stringSkip(str.substring(5));
        }else{
            return str.charAt(0) + stringSkip(str.substring(1));
        }
    }
    public static void main(String[] args) {
        String str = "abcddappledfr";
        System.out.println(stringSkip(str));
    }
}
