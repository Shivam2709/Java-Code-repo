package Array;

import org.w3c.dom.ls.LSOutput;

public class Rotate_Array {
    public static int[] rotate(int arr[], int k) {

        int n = arr.length;
        if(k>n)
            k = k%n;
        arr = reverse(arr,0,n-1);
        arr = reverse(arr,0,k-1);
        arr = reverse( arr, k,n-1);
        return arr;
    }
    public static int[] reverse(int arr[], int start, int end) {

        while (start <= end) {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        int k = 2;
        int ans[] = rotate(arr,k);
         for (int i =0;i<n;i++){
             System.out.print(ans[i]+" ");
         }
    }
}
