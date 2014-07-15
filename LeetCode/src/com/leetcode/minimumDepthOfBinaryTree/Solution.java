package com.leetcode.minimumDepthOfBinaryTree;

import com.leetcode.core.TreeNode;

// AC - Recursion
public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        if (root.left == null) {
            return minDepth(root.right) + 1;
        }
        
        if (root.right == null) {
            return minDepth(root.left) + 1;
        }
        
        int left = minDepth(root.left) + 1;
        int right = minDepth(root.right) + 1;
        
        return Math.min(left, right);
    }
}
