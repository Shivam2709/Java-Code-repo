package RecursionMasterClass;

public class ReverseArray {
    public static void reverse(int [] arr, int sIdx){
        //Termination condition
        if(sIdx >= arr.length){
            //stop
            return;
        }

        //Recursive case
        reverse(arr, sIdx+1);

        //Logic
        System.out.print(arr[sIdx]+ " ");

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7, 9};
        reverse(arr, 0);
    }
}
