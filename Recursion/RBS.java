package Recursion;

public class RBS {
    static int Search(int arr[],int s,int e, int target){
        if(s > e){
            return -1;
        }
        int m =  s + (e - s)/2;
        if(arr[m] == target){
            return m;
        }
        if(arr[s] <= arr[m]){
            if(target >= arr[s] && target <= arr[m]){
                return Search(arr, s, e = m-1, target);
            }else{
                return Search(arr,s = m +1, e, target);
            }
        }

        if(target >= arr[m] && target <= arr[e]){
            return Search(arr,s = m +1, e, target);
        }
        return Search(arr, s, e = m-1, target);

    }
    public static void main(String[] args) {
        int arr[] = {5,6,7,8,9,1,2,3};

        System.out.println(Search(arr,0,arr.length-1, 4));
    }
}
