//QS. Print all the permutations of a string..!
// Time complexity = O(n!).

package Recursion;

public class Permutation {

    public static void printPerm(String str, String permutation) {
        // base case.
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        // using loop for traverse the given string.
        for(int i =0;i<str.length(); i++){
            char currChar = str.charAt(i);

            // creat substring in the given string ans assin in the newstr.

            String newStr = str.substring(0, i) + str.substring(i+1);

            // call funs for second level. and str assign to newStr.
            printPerm(newStr, permutation+currChar);
        }

    }
    public static void main(String[] args) {
        String str = "abc";
        printPerm(str,"");

    }
}
