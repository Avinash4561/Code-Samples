package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMap_Iterator_LeastOccurencesKeyByvalue {

    public static void main(String[] args) {
        String[] input = {"Germany", "Spain", "Germany", "Spain", "Cuba"};

        Map<String, Integer> Hmap1 = new HashMap<>();
        List<String> A1 = new ArrayList<>();

        for (String item : input) {
            int count = Hmap1.containsKey(item) ? Hmap1.get(item) : 0;
            Hmap1.put(item, count + 1);
        }
        List<Integer> values = new ArrayList<>();

        for (Map.Entry<String, Integer> item : Hmap1.entrySet()) {
            values.add(item.getValue());
        }
        Collections.sort(values);

        Iterator<Map.Entry<String, Integer>> itr = Hmap1.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            if (entry.getValue() == values.get(0)) {
                A1.add(entry.getKey());
            }
        }
        System.out.println(Arrays.toString(A1.toArray()));
    }
}
