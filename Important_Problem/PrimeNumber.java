package Important_Problem;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n =sc.nextInt();
        int count =0;

        for(int i= 1; i < n/2; i++){
            if(n%i == 0){
                count++;
            }
        }
        if(count == 1){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");

        }
    }
}
