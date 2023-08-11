package Algorithm;

public class LinearSearch {
    static int Find(int[] arr, int target) {
        for(int i =0; i< arr.length-1; i++){
             if(arr[i] == target){
                 return i;
             }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 55, 66, 78};
        System.out.println(Find(arr, 66));
    }


}
