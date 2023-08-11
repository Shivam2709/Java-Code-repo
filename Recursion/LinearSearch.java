package Recursion;

public class LinearSearch {
    static int Find(int arr[],int target, int index) {
        if(arr.length == index){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return Find(arr,target,index + 1);
        }
    }
    static int FindLast(int arr[],int target, int index) {
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return FindLast(arr,target,index - 1);
        }
    }
    public static void main(String[] args) {
        int arr [] = {3,2,1,18,9};
        System.out.println(Find(arr, 18, 0));
        System.out.println(FindLast(arr, 18, arr.length-1));
    }
}
