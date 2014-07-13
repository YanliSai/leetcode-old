package com.leetcode.MaximumDepthOfBinaryTree;

import com.leetcode.core.TreeNode;

public class Solution {
	// AC - Recursion - time: O(n)
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int left = maxDepth(root.left) + 1;
        int right = maxDepth(root.right) + 1;
        
        return Math.max(left, right);
    }
}
