package com.leetcode.MinimumDepthOfBinaryTree;

import java.util.LinkedList;

import com.leetcode.core.TreeNode;

//AC - BFS - traverse from the top level. If a node has no child, the level of this node is the mimumum depth
public class Solution2 {
 public int minDepth(TreeNode root) {
     if (root == null) {
         return 0;
     }
     
     int level = 0; // The level of the node traversed
     LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
     queue.add(root);
     while (!queue.isEmpty()) {
         level++;
         int size = queue.size();
         for (int i = 0; i < size; i++) { // Operate at the horizontal level
             TreeNode node = queue.removeFirst();
             if (node.left == null && node.right == null) {
                 return level;
             }
             if (node.left != null) {
                 queue.add(node.left);
             }
             if (node.right != null) {
                 queue.add(node.right);
             }
         }
     }
     return level;
 }
}
