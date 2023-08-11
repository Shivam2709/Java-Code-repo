package String;

import java.util.Arrays;
import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
       String name = "Shivam kumar";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('v'));
        System.out.println("     shivam     ".strip());
    }
}
