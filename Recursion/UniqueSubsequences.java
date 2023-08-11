//QS. print all the unique subsequences of a string...!
// time complexity is  O(2^n)

import java.util.HashSet;

public class UniqueSubsequences {

    public static void Unique(String str, int idx, String newString,HashSet<String> set) {
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }

        }
        char currChar = str.charAt(idx);

        //to be
        Unique(str, idx+1, newString+currChar, set);

        // or not to be
        Unique(str, idx+1, newString, set);


    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        Unique(str, 0, "", set);
    }
}
