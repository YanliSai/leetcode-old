package com.leetcode.maximumDepthOfBinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import com.leetcode.core.TreeNode;

// AC - Non-recursion: BFS, using HashMap to store the levels of each node
public class Solution3 {
   public int maxDepth(TreeNode root) {
       if (root == null) {
           return 0;
       }
       
       LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
       Map<TreeNode, Integer> map = new HashMap<TreeNode, Integer>(); // Store level of each node
       
       queue.add(root);
       map.put(root, 1);
       TreeNode node = null;
       while (!queue.isEmpty()) {
           node = queue.removeFirst();
           int level = map.get(node); // The level of the node
           if (node.left != null) {
               queue.add(node.left);
               map.put(node.left, level + 1);
           }
           if (node.right != null) {
               queue.add(node.right);
               map.put(node.right, level + 1);
           }
       }
       
       return map.get(node).intValue(); // The maximum length is the level
   }
}
