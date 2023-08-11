public class reverseString {
    // using for loop
    public static void UsingForLoop(String str) {
        int n = str.length()-1;
        for(int i=n;i>=0;i--){
            System.out.print(str.charAt(i)+" ");
        }
    }
// usingRecursion
    public static void UsingRecursion(String str, int indx){
        if(indx == 0){
            System.out.print(str.charAt(indx)+" ");
            return;
        }
        System.out.print(str.charAt(indx)+" ");
        UsingRecursion(str, indx-1);
    }

    public static void main(String[] args) {
        String str = "abcd";
        //UsingForLoop(str);
        UsingRecursion(str, str.length()-1);
    }
}
