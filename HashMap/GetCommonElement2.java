package HashMap;

import java.util.HashMap;

public class GetCommonElement2 {
    static void CommonElement2(int arr1[], int arr2[]){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int val : arr1){
            if(hm.containsKey(val)){
                int of = hm.get(val);
                int nf = of + 1;
                hm.put(val, nf);

            }else{
                hm.put(val, 1);
            }
        }
        for(int val: arr2){
            if(hm.containsKey(val) && hm.get(val) > 0){
                System.out.print(val+" ");
                int of = hm.get(val);
                int nf = of - 1;
                hm.put(val, nf);
            }
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1, 1, 2, 2, 2, 3, 5};
        int arr2[] = {1, 1, 1, 2, 2, 4, 5};
        CommonElement2(arr1, arr2);
    }
}
