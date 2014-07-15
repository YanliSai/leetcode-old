package com.leetcode.singleNumber;

// AC - Space: O(1), time: O(n)
public class Solution {
	public int singleNumber(int[] A) {
	    if (A == null) {
            throw new IllegalArgumentException();
        }
	    
		int result = 0;
		for (int x : A) {
			result ^= x; // XOR
		}
		return result;
	}
}
