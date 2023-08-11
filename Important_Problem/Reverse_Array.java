package Important_Problem;
import java.util.Scanner;

public class Reverse_Array {
    public static void reverseArray(int arr[], int  n) {

        int i, j, k ;
         for( i =0; i< n/2; i++){
             k = arr[i];
             arr[i] = arr[n - 1-i];
             arr[n -1 -i] = k;
         }
        for( j =0;j < n; j++){
            System.out.print(arr[j]+ " ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int  n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        reverseArray(arr,n);

    }
}
