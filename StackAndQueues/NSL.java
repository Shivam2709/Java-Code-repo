package StackAndQueues;

import java.util.Stack;

public class NSL {
    static int[] NSEL(int [] a){
        int n = a.length;
        int [] NGL = new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i =0; i< n; i++){
            NGL [i] = -1;

            while(!st.empty()){
                int top = st.peek();

                if( top < a[i]){
                    NGL [i] = top;
                    break;
                }else{
                    st.pop();
                }
            }
            st.push(a[i]);
        }
        return NGL;
    }
    public static void main(String[] args) {
        int arr[] = {9, 4, 15, 6, 2, 10};
        int n = arr.length;

        int nums[] = NSEL(arr);
        for(int i =0; i< n; i++){
            System.out.println(arr[i]+"--->"+nums[i]);
        }
    }
}
