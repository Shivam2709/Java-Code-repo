package Important_Problem;

public class Second_Largest {
    public static int secondMax(int arr[], int n) {
    // set max and second max is minimum  value of integer range.
        int max = Integer.MIN_VALUE; // -2147483648
        int second_max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){

    // compare arr[i] with minimum range of integer.
            if(arr[i]>max){
                second_max = max;
                max = arr[i];

    // compare arr[i] with second_max and max value 0f array.
            }else if(arr[i] >second_max && arr[i] != max){
                second_max = arr[i];
            }
        }
        return second_max;

    }
    public static void main(String[] args) {
        int arr [] = {6, 8, 2, 4, 3, 1, 5, 7,9};
        int n = arr.length;
        int ans = secondMax(arr,n);
        System.out.println(ans);
    }
}
