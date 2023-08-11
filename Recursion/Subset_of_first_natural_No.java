//QS. Print all the subset of first n natural number...!
// Time complexity = O(2^n)

import java.util.ArrayList;

public class Subset_of_first_natural_No {
    // print all the subset value.
    public static void printsubset(ArrayList<Integer> subset) {
        for(int i =0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }

    public static void fineSubset(int n, ArrayList<Integer> subset) {
        // base case.
        if(n == 0){
            printsubset(subset);
            return;
        }

        // add hoga
        subset.add(n);
        fineSubset(n-1, subset);

        // add nahi hoga
        subset.remove(subset.size()-1);
        fineSubset(n-1, subset);


    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        fineSubset(n, subset);
    }

}
