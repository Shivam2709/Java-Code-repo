package Important_Problem;

public class BinaryToDecimal {
    static int binary(int n){
        int ans = 0; // convert decimal number.
        int pw =1; // 2^0 = 1 power of 2.

        while( n > 0){
           int unit_digit = n % 10;
           ans += (unit_digit * pw);
            n /= 10;
            pw *= 2;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(binary(1011));
    }
}
