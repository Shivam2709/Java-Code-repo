package Important_Problem;
import java.util.Scanner;

public class fibonacci {

    public static void recursive_method(int num1, int num2, int n){
        if(n == 0){
            return;
        }

        int num3 = num1 + num2;
        System.out.print(num3+" ");
        recursive_method(num2, num3, n-1);
    }

    public static void method_2(int n) {
        int num1 = 0;
        int num2 = 1;

        int count =0;
        while(count < n){
            System.out.print(num1+" ");

         //swap
         int num3 = num2 + num1;
         num1 = num2;
         num2 = num3;
         count+=1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int num1 =0;
        int num2 = 1;
        System.out.print(num1+" ");
        System.out.print(num2+" ");
        recursive_method(num1, num2, n-2);
       // method_2(n);
    }
}
