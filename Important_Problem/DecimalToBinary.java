package Important_Problem;

public class DecimalToBinary {
    static int decimal(int n){
        int ans =0;
        int pw = 1;

        while( n > 0){
            int parity = n % 2;
            ans += (parity * pw);
            pw *= 10;
            n /=2;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(decimal(11));
    }
}
