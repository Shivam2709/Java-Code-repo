// Time Complexity is O(n log n)
package Algorithm;

public class MergeSort {
    static void conquer(int arr[], int l, int mid, int r){
        int merge[] = new int[r - l + 1];

        int indx1 = l;
        int indx2 = mid+1;
        int x = 0;

        while(indx1 <= mid && indx2 <= r){
            if(arr[indx1] <= arr[indx2]){
                merge[x++] = arr[indx1++];
            }else{
                merge[x++] = arr[indx2++];
            }
        }
        while(indx1 <= mid){
            merge[x++] = arr[indx1++];
        }

        while (indx2 <= r){
            merge[x++] = arr[indx2++];
        }

        for(int i =0, j = l; i < merge.length; i++, j++){
            arr[j] = merge[i];
        }
    }
    static void divide(int arr[], int l, int r){
        if(l >= r){
            return;
        }
        int mid = l + ( r- l)/2;
        divide(arr, l, mid);
        divide(arr, mid+1, r);
        conquer(arr, l, mid, r);
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        divide(arr,0, n-1);
        // print
        for(int i =0; i< n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
