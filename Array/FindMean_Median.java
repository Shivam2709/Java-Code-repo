package Array;

import java.util.Arrays;

public class FindMean_Median {
    public static void Mean(int arr[], int n ) {
        int sum = 0;
        int mean = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        mean = sum / n;
        System.out.println(mean);
    }

    public static int Median(int arr[], int n) {

        Arrays.sort(arr);
//  check for even case
        if(n %2 != 0){
            return arr[n/2];
        }
        return arr[n-1/2] + arr[n/2];


    }
    public static void main(String[] args) {
        int arr [] ={1, 2, 19, 28, 5};
        int n = arr.length;
        Mean(arr,n);
        int ans = Median(arr,n);
        System.out.println(ans);

    }
}
