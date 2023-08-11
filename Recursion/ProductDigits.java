package Recursion;

public class ProductDigits {
    public static int prod(int n) {
        if(n % 10 == n){
            return n;
        }
        return (n%10) * prod(n/10);
    }
    public static void main(String[] args) {
        int n = 555;
        int ans = prod(n);
        System.out.println(ans);
    }
}
