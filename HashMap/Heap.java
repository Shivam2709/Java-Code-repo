// Time Complexity is O(n log n).
// Space Complexity is O(n)
package HashMap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap {
    public static void main(String[] args) { // use Collections.reverseOrder() for print decanding Order.
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int rank []={22,99,3,11,88,4,1};

        for(int val:rank){
            pq.add(val);
        }
        while(pq.size() > 0){
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
    }
}
