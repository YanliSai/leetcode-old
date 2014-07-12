package com.leetcode.SingleNumberII;

// AC - Time:O(n), Space: O(1)
public class Solution {
    public int singleNumber(int[] A) {
        int res = 0;
        for (int i = 0; i < 32; i++) { // int has 32 bit in Java
            int sum = 0; // sum of each elecment in A at bit i
            for (int a : A) {
                sum += (a >> i & 1); // get i bit
            }
            res |= (sum % 3) << i; // shift i bit and OR
        }
        return res;
    }
}