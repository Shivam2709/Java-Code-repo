
public class LeaderInArray {
    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
        int n= arr.length;
        int max_value = arr[n-1];
        int k = 0;
        int printArray[] = new int[n];

        for(int i = n-1;i>=0;i--){
            if(max_value <= arr[i]){
                max_value = arr[i];

                printArray[k] = max_value;
                k++;
            }
        }

        for(int i=k-1; i>=0; i--)
            System.out.print(printArray[i]+" ");

    }
}
