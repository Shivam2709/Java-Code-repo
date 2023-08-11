//QS. Print aii the subsequences of a string..!
// time complexity is  O(2^n)
public class Subsequences {

    public static void SubString(String str, int idx, String newString) {
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        //to be
        SubString(str, idx+1, newString+currChar);

        // or not to be
        SubString(str, idx+1, newString);


    }
    public static void main(String[] args) {
        String str = "abc";
        SubString(str, 0, "");
    }

}
