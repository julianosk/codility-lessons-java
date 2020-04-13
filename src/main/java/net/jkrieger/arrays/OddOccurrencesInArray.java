package net.jkrieger.arrays;

import java.util.HashMap;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int value : A) {
            if (map.containsKey(value)) {
                map.remove(value);
            } else {
                map.put(value, value);
            }
        }

        return (Integer) map.values().toArray()[0];
    }
}
