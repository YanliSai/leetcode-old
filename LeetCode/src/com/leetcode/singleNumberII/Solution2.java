package com.leetcode.singleNumberII;

import java.util.HashMap;
import java.util.Map;

// AC - Space: O(n), Time: O(n)
public class Solution2 {
    public int singleNumber(int[] A) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(); // Element : Occurrence
        for (int a : A) {
            if (!map.containsKey(a)) { // Not in the map
                map.put(a, 1);
            } else {
                map.put(a, map.get(a) + 1);
            }
        }
        
        for (int i : map.keySet()) {
            if (map.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }
}
