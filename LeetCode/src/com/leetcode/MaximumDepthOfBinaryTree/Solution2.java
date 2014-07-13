package com.leetcode.MaximumDepthOfBinaryTree;

import java.util.LinkedList;

import com.leetcode.core.TreeNode;

//AC - Non-recursion: BFS
public class Solution2 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int level = 0;

        while (!queue.isEmpty()) {
            level++;
           
            int size = queue.size(); // !!! The queue size is changing
            for (int i = 0; i < size; i++) { // each level
                TreeNode node = queue.removeFirst();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        
        return level; // The maximum length is the level
    }
}
