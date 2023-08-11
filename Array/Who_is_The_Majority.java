package Array;

public class Who_is_The_Majority {
    public static int Majority(int arr[], int n, int x, int y) {
        int count =0, count2 =0, k=0, j=0;

        for(int i =0;i<n; i++){
            if(arr[i] == x){
                count = arr[i];
                k++;
            }
            else if(arr[i] == y){
                count2 = arr[i];
                j++;
            }
        }
        if(k>j){
            return count;
        }
        else if( k == j){
            if(k>j){
                return count;
            }
        }
        return count2;
    }
    public static void main(String[] args) {
        int arr [] = {40, 85, 9, 14, 53};
        int n = arr.length;
        int x = 9, y = 53;
        int ans = Majority(arr, n ,x, y);
        System.out.println(ans);
    }
}
