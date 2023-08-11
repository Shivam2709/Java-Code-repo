package Recursion;

public class back_Counting {
    public static void backCAll(int n){
        if(n ==0){
            return;
        }
        System.out.print(n +" ");
        backCAll(n-1);
    }
    public static void Counting(int n){
        if(n ==0){
            return;
        }
        Counting(n-1);
        System.out.print(n +" ");
    }
    public static void both(int n){
        if(n ==0){
            return;
        }
        System.out.print(n +" ");
        both(n-1);
        System.out.print(n +" ");
    }
    public static void main(String[] args) {
        Counting(5);
        System.out.println();
        backCAll(5);
        System.out.println();
        both(5);

    }
}
