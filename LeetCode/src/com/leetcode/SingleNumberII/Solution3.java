package com.leetcode.SingleNumberII;

import java.util.HashSet;
import java.util.Set;

// AC - Space: O(n), time: O(n)
public class Solution3 {
    public int singleNumber(int[] A) {
        int result = 0;
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for (int a : A) {
            if (!set1.add(a)) { // If add int failed
                set2.add(a);    // Duplicate numbers will be added to set 2
            }
        }
        set1.removeAll(set2);   // Difference between set1 and set2.
        for (int num : set1) {  // There is only one number left in set1
            result = num;
        }
        return result;
    }
}
