package Important_Problem;
public class Max_Min_Array {
public static int MAX(int arr[]){
 int n = arr.length;

 int max = arr[0];

 for(int i =1; i<n; i++){
    if(max <= arr[i]){
        max = arr[i];
    }
 }
 return max;
    
}
public static int MIN(int arr[] ) {
    int n = arr.length;

    int min = arr[0];

    for(int i =1; i< n; i++){
        if(min >= arr[i]){
            min = arr[i];
        }
    }
    return min;
    
}
public static void main(String[] args) {
    int arr [] = {6, 8,  4, 3, 60, 7,9};
    int result = MAX(arr);
    int ans = MIN(arr);
    System.out.println(result);
    System.out.println(ans);
}
}