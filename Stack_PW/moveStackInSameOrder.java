package Stack_PW;

import java.util.Scanner;
import java.util.Stack;

public class moveStackInSameOrder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        //reverse order
        Stack<Integer> temp = new Stack<>();
        while(st.size()>0){
            temp.push(st.pop());
        }
        Stack<Integer> rt = new Stack<>();
        while(temp.size()>0) {
            rt.push(temp.pop());
        }
        System.out.println(rt);
        System.out.println(st);
    }
}
