package Recursion;

public class DigitsSum {
    public static int sumDigits(int n){
        if(n == 0){
            return n;
        }
        return (n%10) + sumDigits(n /10)  ;
    }
    public static void main(String[] args) {
        int n = 1342;
        int ans = sumDigits(n);
        System.out.println(ans);
    }
}
