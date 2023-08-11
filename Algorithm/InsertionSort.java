/*The first element in the array is assumed to be sorted. Take the second element and store it separately in key.
Compare key with the first element. If the first element is greater than key, then key is placed in front of the first element.
Now, the first two elements are sorted.
Take the third element and compare it with the elements on the left of it. Placed it just behind the element smaller than it.
If there is no element smaller than it, then place it at the beginning of the array.
Similarly, place every unsorted element at its correct position */

// Time Complexity is O(N^2).
// Space Complexity is O(1).
package Algorithm;

public class InsertionSort {
    static int[] Insert(int arr[]){
        int size = arr.length;

        for(int i = 1; i< size; i++){
            int key = arr[i];
            int j = i -1;

            while(j >=0 && key < arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] ={9, 5, 1, 4, 3};

        int nums [] = Insert(arr);
        for(int i =0; i< nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
