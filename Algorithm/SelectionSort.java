// Time Complexity is O(n^2).
// Space complexity is O(1).
package Algorithm;

public class SelectionSort {
    static int [] Sort(int arr[]){
        int n = arr.length;
        for(int i =0; i< n-1; i++){

            int min = i;
            for( int j = i+1; j< n; j++){
                if(arr[j] < arr[min]){
                    min = j;

                    // Swap the found minimum element with the first
                    // element
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        int arr[] = {1, 55, 32, 4, 5, 66, 78};
        int nums[] = Sort(arr);

        for(int i =0; i < nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
