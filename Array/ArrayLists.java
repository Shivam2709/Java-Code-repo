package Array;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // add elements
        list.add(0);
        list.add(1);
        list.add(2);

        System.out.println(list);
        // get elements.
        int element = list.get(1);
        System.out.println(element);

        // add element in between.
        list.add(1,3);
        System.out.println(list);

    // set/ update element in array.
        list.set(0,5);
        System.out.println(list);

    // delete element.
        list.remove(2);
        System.out.println(list);

    // size
        int size = list.size();
        System.out.println(size);

     // loops.
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

    // sorting.
           Collections.sort(list);
        System.out.println(list);

    }

}
