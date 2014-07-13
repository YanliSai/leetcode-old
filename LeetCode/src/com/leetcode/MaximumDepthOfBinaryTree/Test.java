package com.leetcode.MaximumDepthOfBinaryTree;

import com.leetcode.core.TreeNode;

public class Test {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        
        node1.left = node2;
        node1.right = node3;
        node2.right = node4;
        
        Solution solution = new Solution();
        int num = solution.maxDepth(node1);
        
        System.out.println(num);
    }

}
