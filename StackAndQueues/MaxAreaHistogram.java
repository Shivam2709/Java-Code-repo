package StackAndQueues;

import java.util.Stack;

public class MaxAreaHistogram {
    static int largestRectangleArea(int arr[]){
        int maxArea = 0;
        for(int i =0; i < arr.length; i++){
            for(int j = i; j< arr.length; j++){
                int minheight = Integer.MAX_VALUE;
                for(int k =i; k<=j; k++)
                    minheight = Math.min(minheight, arr[k]);
                maxArea = Math.max(maxArea, minheight * (j - i +1));
            }
        }
        return maxArea;
    }

    // USing Stack..
    static int calculateArea(int arr[]){

        int RSE [] = new int[arr.length];   // Right Smaller Element..
        Stack<Integer> st = new Stack<>();
        st.push(arr.length -1);
        RSE[arr.length - 1] = arr.length;

        for(int i = arr.length - 2; i >= 0; i--){
            while(st.size() > 0 && arr[i] < arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                RSE[i] = arr.length;
            }else{
                RSE[i] = st.peek();
            }
            st.push(i);
        }
        int LSE [] = new int [arr.length];   // Left Smaller Element..
        st = new Stack<>();
        st.push(0);
        LSE[0] = -1;

        for(int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] < arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                LSE[i] = -1;
            } else {
                LSE[i] = st.peek();
            }
            st.push(i);
        }
        int maxArea = 0;
        for( int i =0; i < arr.length; i++){
            int width = RSE[i] - LSE[i] - 1;
            int area = arr[i] * width;

            if(area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int arr[] ={1,1};
        System.out.println(largestRectangleArea(arr));
        System.out.println(calculateArea(arr));
    }
}
