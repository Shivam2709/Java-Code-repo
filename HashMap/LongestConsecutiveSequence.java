// Time Complexity is O(n).
package HashMap;

import java.util.HashMap;

public class LongestConsecutiveSequence {
    static void ConsecutiveSequences(int arr[]){
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int val: arr){
            map.put(val, true);
        }

        for(int val: arr){
            if(map.containsKey(val - 1)){
                map.put(val, false);
            }
        }
        int max_start_point = 0;
        int max_len = 0;
        for(int val: arr){
            if(map.get(val) == true){
                int temp_len = 1;
                int start_point = val;

                while (map.containsKey(start_point + temp_len)){
                    temp_len++;
                }

                if(temp_len > max_len){
                    max_start_point = start_point;
                    max_len = temp_len;
                }
            }
        }
        for(int i =0; i< max_len; i++){
            System.out.print(max_start_point + i + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 5, 9, 1, 11, 8, 6, 15, 3, 12, 2};
        ConsecutiveSequences(arr);
    }
}
