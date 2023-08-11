package HashMap;

import java.util.HashMap;
import java.util.Set;

public class Introduction {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 135);
        hm.put("china", 140);
        hm.put("us", 35);
        hm.put("uk", 30);
        hm.put("pak", 40);

        System.out.println(hm);

        hm.put("Nigeria", 5);
        hm.put("us", 25);

        System.out.println(hm);

        System.out.println(hm.get("India"));
        System.out.println(hm.get("utopia"));

        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("utopia"));

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String key : hm.keySet()){
            Integer val = hm.get(key);
            System.out.println(key + " "+ val);
        }
    }
}
