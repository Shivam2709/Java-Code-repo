/* Smallest Number whose product of digits is N.
   Given a positive number N. You need to find the smallest
   number S such that product of digits of S is equal to N.
*/
package DSAQuestion;

import java.util.Scanner;

public class SmallestNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    public static int solution(int n){
        String ans ="";
        for(int div =9; div >= 2; div --){
            while(n % div == 0){
                n = n / div;
                ans = div + ans;
            }
        }

        if(n != 1){
            return -1;
        }else{
            return Integer.parseInt(ans);  /* It is used to parse the string value as a signed decimal value.
                                           It is used in Java for converting a string value to an integer by using the method parseInt().
                                           */
        }
    }
}
