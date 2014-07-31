package com.leetcode.permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
	public List<List<Integer>> permute(int[] num) {
        if (num == null || num.length == 0) {
            return null;
        }
        List<List<Integer>> rst = new ArrayList<List<Integer>>();
        permute(num, new ArrayList<Integer>(), rst, new boolean[num.length]);
        return rst;
    }
    
    private void permute(int[] num, List<Integer> list, List<List<Integer>> rst, boolean[] visited) {
        if (list.size() == num.length) { // list contains all the numbers
            rst.add(new ArrayList<Integer>(list)); // Cannot add list dirrectly. Need make a copy
            return;
        }
        for (int i = 0; i < num.length; i++) {
            if (!visited[i]) { // No duplicate element in the list
                list.add(num[i]);
                visited[i] = true;
                permute(num, list, rst, visited);
                list.remove(list.size() - 1); // Backtracking: remove the last element
                visited[i] = false;
            }
        }
    }
}
