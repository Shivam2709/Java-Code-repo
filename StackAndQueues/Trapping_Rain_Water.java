package StackAndQueues;

public class Trapping_Rain_Water {

    // Method 1.
    // Time Complexity is O(N).
    // Space complexity is O(N).
    static int waterTrapped(int arr[]){
        int n = arr.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        int max =0;
        int totalWater =0;

        for(int i = 0; i < n; i++){
            max = Math.max(max,arr[i]);
            leftMax[i] = max;
        }
        max =0;
        for(int i = n-1; i >= 0;i--){
           max = Math.max(max, arr[i]);
           rightMax[i] = max;
        }

        for(int i =n-1; i >= 0; i--){
            int water = Math.min(leftMax[i], rightMax[i]) - arr[i];
            totalWater += water;
        }
        return totalWater;
    }

    // method 2..
    // Time Complexity is O(N).
    // Space complexity is O(1).
    static int trappedWater(int arr[]){
        int n = arr.length;
        int max =0;
        int maxIndex =0;
        int totalWater =0;

        for(int i =0; i< n; i++){
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }

        int leftMax =0;
        // Part1..
        for(int  i=0; i< maxIndex; i++){
            leftMax = Math.max(leftMax, arr[i]);
            int water = Math.min(leftMax,max) - arr[i];
            totalWater += water;
        }

        // Part2..
        leftMax =0;
        for(int i = n-1; i>maxIndex; i--){
            leftMax = Math.max(leftMax,arr[i]);
            int water = Math.min(leftMax,max) - arr[i];
            totalWater += water;
        }
        return totalWater;
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(waterTrapped(arr));
        System.out.println(trappedWater(arr));
    }
}
