package com.leetcode.balancedBinaryTree;

import com.leetcode.core.TreeNode;

//AC - recursion, time: O(n^2), space: O((nlog(n))^2)???
public class Solution2 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) { return true; }
        boolean isRootSatisfied = (Math.abs(height(root.left) - height(root.right)) <= 1);
        return isRootSatisfied && isBalanced(root.left) && isBalanced(root.right);
    }
    
    // Return the height of a tree
    private int height(TreeNode root) {
        if (root == null) { return 0; }
        int leftHeight  = height(root.left) + 1;
        int rightHeight = height(root.right) + 1;
        return Math.max(leftHeight, rightHeight);
    }
}
