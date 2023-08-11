// The stock span problem is a financial problem.
// where we have a series of n daily price quotes for a stock and we need to calculate span of stock’s price for all n days.
package StackAndQueues;

import java.util.Stack;

public class StockSpanProblem {
    public static int[] getStockSpan(int price[], int n){

        Stack<Integer> st = new Stack<>();

        int span[] = new int[n];

        st.push(0);

        span[0] = 1;
        for(int i = 1;i<n;i++){

            while(!st.isEmpty() && price[st.peek()] <= price[i]){
                st.pop();
            }

            if(st.isEmpty()){
                span[i] = i + 1;
            } else{
                span[i] = i - st.peek();
            }
            st.push(i);
        }

        return span;
    }
    public static void main(String[] args) {
        int arr[] = {100, 80, 60, 70, 60, 75, 85};
        int n = arr.length;

        int num[] = getStockSpan(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]  + "--->"  + num[i]);
        }
    }
}
