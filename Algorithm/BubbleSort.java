// Time Complexity is O (n^2).
// Space Complexity is O(1).
package Algorithm;

public class BubbleSort {
    static int [] Bubble(int arr[]){
        int size = arr.length;

        for(int i =0; i< size-1; i++){
            for(int j = 0; j < size -i -1; j++){
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {-2, 45, 0, 11, -9};
        int nums [] = Bubble(arr);
        for(int i =0; i< nums.length; i++){
            System.out.print(nums[i]+" ");
        }

    }
}
