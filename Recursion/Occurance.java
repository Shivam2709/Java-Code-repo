//Qs.First and last occurance of element in the string...!
package Recursion;
public class Occurance {
    public  static int first = -1;
    public static int last = -1;
    public static void FindOccurance(String str, int indx, char element) {

        if(indx == str.length()-1){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentChar = str.charAt(indx);
        if(currentChar == element){
            if(first == -1){
                first = indx;
            }else{
                last =indx;
            }
        }
        FindOccurance(str, indx+1,element);
    }
    public static void main(String[] args) {
         String str = "abaacdaefaah";
         FindOccurance(str,0,'a');
    }

}
