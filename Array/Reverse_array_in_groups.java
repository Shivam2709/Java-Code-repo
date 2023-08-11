package Array;

public class Reverse_array_in_groups {
    public static void Groups(int arr [], int k) {
        int n = arr.length;

        for(int i =0;i<n ;i=i + k){
            int l =i;
        // here r is simply current value of (i + k(3) -1).
            int r = Math.min(i+k -1 , n -1);
            int temp;

            while (l <r){
                temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;r--;

            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8};
        int k =3;
        Groups(arr, k);
    }
}
