package Recursion;

public class binary_Search {
    public static int BS(int arr[], int target, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e-s) /2;
        if(arr[m] == target ){
            return m;
        }else if(target < arr[m]){
            return BS(arr, target, s, e = m-1);
        }
        return BS(arr, target, s = m+1, e);
    }
    public static void main(String[] args) {
            int arr[] = {1, 2, 3, 4, 55, 66, 78};
            int target =66;
        System.out.println( BS(arr, target, 0, arr.length -1));
    }
}
