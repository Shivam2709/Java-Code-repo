package Important_Problem;

import java.util.HashSet;

public class Remove_Duplicate {
    public static void main(String[] args) {
        int arr [] = {1,2,3,2,9,4,5,3,5,4};
        int n = arr.length;

        if(n==0 || n==1){
            return ;
        }

        HashSet<Integer> hs = new HashSet<>();  // The Property of HashSet is that they do not add duplicate into set or Hash table..!
        for(int i =0; i < arr.length; i++){
            hs.add(arr[i]);
        }

        for(int j: hs){
            System.out.print(j+ " ");
        }
    }
}
