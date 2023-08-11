package Important_Problem;
import java.util.Scanner;

public class Prime_In_Range {
    public static void method_1(int min, int max) {
        int count =0;

        for(int n = min; n<= max; n++) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    count = 1;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(n + " ");
            }
        // set count is zero for the next number.
            count = 0;
        }
    }

    public static boolean method_2(int num) {
        for(int i = 2; i <= num/i; ++i) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Min Number ");
        int min = sc.nextInt();
        System.out.println("Enter the Max Number ");
        int max = sc.nextInt();

    //    method_1(min, max);

        for(int i = min; i<= max;i++){
            if(method_2(i)){
                System.out.print(i+" ");
            }
        }
    }
}
