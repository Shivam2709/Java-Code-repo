package Important_Problem;
public class LargestValue {
    public static void maxValue(int arr[]) {
        int n = arr.length;
// we assume that first value of array id max value.
        int max = arr[0];
        for(int i =1;i<n;i++){
// here we compare current value and max value.
            if(max <= arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);

    }
    public static void main(String[] args) {
         int arr[] = {5,2,8,3,1,9,4};
         maxValue(arr);



    }
}
