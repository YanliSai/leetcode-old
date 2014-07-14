package com.leetcode.SameTree;

import com.leetcode.core.TreeNode;

// AC - recursion
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }

        return (p.val == q.val && isSameTree(p.left, q.left) && isSameTree(
                p.right, q.right));
    }
}
