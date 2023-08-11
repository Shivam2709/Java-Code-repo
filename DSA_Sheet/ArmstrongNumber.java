package DSA_Sheet;

public class ArmstrongNumber {
    static void Armstronge(int n) {
        // Find length of number..
        int len = String.valueOf(n).length();
        int tem = n;
        int result =0;
        while (tem != 0) {
            int rem = tem % 10;
            result += Math.pow(rem, len);
            tem = tem /10;
        }

        if(n == result) {
            System.out.println("Armstrong Number");
        }else {
            System.out.println("Not a Armstrong Number");
        }
    }
    public static void main(String[] args) {
        int n =153;
        Armstronge(n);
    }
}
