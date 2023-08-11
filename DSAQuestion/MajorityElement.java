/* Given an array. you need to find the majority element in the array.
   Majority element is defined as the element which is appearing more than n/2 time in the array of length n.
   Note- if there is no majority element, return -1.

   Apply Moore's Voting Algorithm.
 */
package DSAQuestion;

public class MajorityElement {
    public static int findMajorityElement(int[] arr, int n){
        int candidate = arr[0];
        int count =1;

        for(int i =1; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }

        // verify if candidate is your ans or not
        count =0;
        for(int val : arr){
            if(val == candidate){
                count++;
            }
        }

        if(count > n / 2){
            return candidate;
        }else{
            return -1;
        }

    }
    public static void main(String[] args) {
        int [] arr = {4, 4, 3, 4, 7, 3, 4, 4, 7, 4, 4, 7, 4, 4};
        System.out.println(findMajorityElement(arr, arr.length));
    }
}
