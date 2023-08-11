// complexity of this program is log(n)
public class Power {
    public static int calpower(int x, int n) {

        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        // if n is even
        if(n % 2 == 0) {
            return calpower(x, n / 2) * calpower(x, n / 2);
        }
        else{ // if n is odd
            return calpower(x, n/2) * calpower(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
         int x =2, n = 5;
         int ans = calpower(x, n);
        System.out.println(ans);
    }
}
