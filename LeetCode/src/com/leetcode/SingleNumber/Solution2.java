package com.leetcode.SingleNumber;

import java.util.HashSet;
import java.util.Set;

// AC - Space: O(n), time: O(n)
public class Solution2 {
    public int singleNumber(int[] A) {
        if (A == null) {
            throw new IllegalArgumentException();
        }
        
        Set<Integer> set = new HashSet<Integer>();
        for (int a : A) {
            if (!set.add(a)) { // If adding fails, a exists in the set
                set.remove(a); // Remove this number
            }
        }
        
        int res = 0;
        for (int a : set) { // Only one element in A
            res = a;
        }
        
        return res;
    }
}
