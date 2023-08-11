// Find unique number in the array.
package Questions;

public class UniqueNo {
    public static void main(String[] args) {
        int arr[] ={2, 3, 4, 3, 6, 2, 4};
        System.out.println(Unique(arr));
    }

    private static int Unique(int[] arr) {
        int ans = 0;

        for(int n : arr){
            ans = ans ^ n; // XOR operator.
        }
        return ans;
    }

}
