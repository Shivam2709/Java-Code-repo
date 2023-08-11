// Time Complexity is O(Log N).
// Space Complexity is O(1).
package Algorithm;

public class BinarySearch {
    static int Find(int arr[], int target){
        int start = 0;
        int end = arr.length-1;

        for(int i =0; i < end /2 ; i++){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }else if(target < arr[mid]){
                end = mid -1;
            }
        }
            return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 55, 66, 78};
        System.out.println(Find(arr, 88));
    }
}
