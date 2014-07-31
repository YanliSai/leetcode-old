package com.leetcode.permutations;

import java.util.ArrayList;
import java.util.List;

// AC: O(n!)
public class Solution {
	public List<List<Integer>> permute(int[] num) {
        if (num == null || num.length == 0) {
            return null;
        }
        List<List<Integer>> rst = new ArrayList<List<Integer>>();
        permute(num, new ArrayList<Integer>(), rst);
        return rst;
    }
    
    private void permute(int[] num, List<Integer> list, List<List<Integer>> rst) {
        if (list.size() == num.length) { // list contains all the numbers
            rst.add(new ArrayList<Integer>(list)); // Cannot add list dirrectly. Need make a copy
            return;
        }
        for (int element : num) {
            if (!list.contains(element)) { // No duplicate element in the list
                list.add(element);
                permute(num, list, rst);
                list.remove(list.size() - 1); // Backtracking: remove the last element
            }
        }
    }
}
