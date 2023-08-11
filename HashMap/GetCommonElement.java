// package HashMap;

import java.util.HashMap;

public class GetCommonElement {
    static void CommonElement(int arr1[], int arr2[]){
        HashMap<Integer, Integer> fmap = new HashMap<>();
        for(int val:arr1){
            if(fmap.containsKey(val)){
                int of = fmap.get(val); // old frequency
                int nf = of + 1;  // new frequency.
                fmap.put(val, nf);
            }else{
                fmap.put(val, 1);
            }
        }
        for(int val : arr2){
            if(fmap.containsKey(val)){
                System.out.print(val +" ");
                fmap.remove(val);
            }
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1, 1, 2, 2, 2, 3, 5};
        int arr2[] ={1, 1, 1, 2, 2, 4, 5};
        CommonElement(arr1, arr2);
    }
}
