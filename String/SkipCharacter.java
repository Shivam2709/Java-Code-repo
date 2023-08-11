package String;

public class SkipCharacter {
    static String skip1(String str){
        if(str.isEmpty()){
            return "";
        }

        char ch = str.charAt(0);

        if(ch == 'a'){
            return skip1(str.substring(1));
        } else{
           return  ch + skip1(str.substring(1));
        }
    }

    static void skip2(String p, String str){
        if(str.isEmpty()){
            System.out.println(p);
            return;
        }
       char ch = str.charAt(0);

        if(ch == 'a'){
            skip2(p, str.substring(1));
        } else{
            skip2(p + ch, str.substring(1));
        }
    }
    public static void main(String[] args) {
        String str = "baccadahag";
       skip2("", str);
        System.out.println( skip1(str));
    }
}
