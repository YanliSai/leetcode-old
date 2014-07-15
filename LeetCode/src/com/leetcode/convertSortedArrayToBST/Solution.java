package com.leetcode.convertSortedArrayToBST;

import com.leetcode.core.TreeNode;

// AC - Time: O(n), Space: O(log(n))
public class Solution {
    public TreeNode sortedArrayToBST(int[] num) {
        return sortedArrayToBST(num, 0, num.length - 1);
    }
    
    private TreeNode sortedArrayToBST(int[] num, int start, int end) {
        if (start > end) { // Base case
            return null; 
        } 
        
        int mid = (end + start) / 2; // Middle index
        TreeNode root = new TreeNode(num[mid]);
        root.left = sortedArrayToBST(num, start, mid - 1);
        root.right = sortedArrayToBST(num, mid + 1, end);
        
        return root;
    }
}
