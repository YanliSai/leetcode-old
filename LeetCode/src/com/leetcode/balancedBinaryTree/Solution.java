package com.leetcode.balancedBinaryTree;

import com.leetcode.core.TreeNode;

//AC - Time: O(n), Space: O(nlog(n))
public class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }
    
    // Return the height of a tree - return -1 if unbalanced (save time)
    private int height(TreeNode root) {
        if (root == null) { return 0; }
        
        int left  = height(root.left);
        if (left == -1) {
            return -1;
        }
        int right = height(root.right);
        if (right == -1) {
            return -1;
        }
        
        return Math.abs(left - right) > 1 ? -1 : Math.max(left, right) + 1;
    }
}
