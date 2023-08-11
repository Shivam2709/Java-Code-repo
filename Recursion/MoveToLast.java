//Qs. Move all 'x' to the end of the string..
package Recursion;

public class MoveToLast {
    public static void MoveAllX(String str,int idx, int count, String newString) {
        if(idx == str.length()){
            for(int i =0;i<count;i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            MoveAllX(str, idx+1, count,newString);
        }else{
            newString += currChar; // newString = newString + currChar
            MoveAllX(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        MoveAllX(str,0,0,"");

    }
}
