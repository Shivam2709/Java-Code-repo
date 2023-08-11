// Next Greater Element (NGE) for every element in given Array.
package StackAndQueues;

import java.util.Stack;

public class NGR {
    static int[] NGER(int arr[]){
        int n = arr.length;
        int store[] = new int [n];

        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i>= 0; i--){
            store[i] = -1;
            while(!st.empty()){
                int top = st.peek();

                if(top > arr[i]){
                    store[i] = top;
                    break;
                }else {
                    st.pop();
                }
            }
            st.push(arr[i]);
        }
        return store;
    }
    public static void main(String[] args) {
        int arr[] = {6, 4, 12, 5, 2, 10};
        int n = arr.length;

        int nums[] = NGER(arr);
        for(int i =0; i< n;i++){
            System.out.println(arr[i]+" ---> "+nums[i]);
        }
    }
}
