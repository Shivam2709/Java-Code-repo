// Time Complexity is O(n^2).
// Space Complexity is O(log n).

package Algorithm;

public class QuickSort {

    static int partition(int arr[], int low, int high){

        int pivot = arr[high];
        int i = (low - 1);

        for(int j =low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                // Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
    static void Quick(int arr[], int low, int high){
        if(low< high){
            int pi = partition(arr, low, high);

            Quick(arr, low, pi -1);
            Quick(arr, pi + 1, high);
        }
    }
    public static void main(String[] args) {
        int arr[] ={10, 7, 8, 9, 1, -5};
        int n = arr.length;

       Quick(arr, 0, n-1);

        for(int i =0; i <n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
