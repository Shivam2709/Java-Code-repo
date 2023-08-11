package Recursion;

public class SortedArray {
    public static boolean sortArray1(int arr[], int n) {

        if(n == 0 || n == 1){
            return true;
        }
        for(int i =1; i< n; i++){
            if(arr[i -1] > arr[i]){
                return false;
            }
        }
        return true;
    }
    static boolean sortedArray2(int arr[], int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index + 1] && sortedArray2(arr, index +1);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,15};
        int n = arr.length-1;
        System.out.println(sortArray1(arr, n));
        System.out.println(sortedArray2(arr,0));
    }
}
