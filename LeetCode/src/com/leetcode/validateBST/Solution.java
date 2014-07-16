package com.leetcode.validateBST;

import com.leetcode.core.TreeNode;

// AC - In order traversal. Time: O(n), Space: O(log(n))
public class Solution {
	private int value = Integer.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isValidBST(root.left)) {
            return false;
        }
        if (value >= root.val) {
            return false;
        }
        value = root.val;

        return isValidBST(root.right);
    }
}
