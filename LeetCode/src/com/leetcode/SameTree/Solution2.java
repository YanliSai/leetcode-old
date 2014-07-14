package com.leetcode.SameTree;

import java.util.LinkedList;

import com.leetcode.core.TreeNode;

//AC - BFS - compare each node
public class Solution2 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>(); // BFS traverse the node
        queue.add(p);
        queue.add(q);
        
        while (!queue.isEmpty()) {
            TreeNode nodeP = queue.removeFirst();
            TreeNode nodeQ = queue.removeFirst();
            
            if (nodeP != null && nodeQ != null && nodeP.val == nodeQ.val) {
                queue.add(nodeP.left);
                queue.add(nodeQ.left);
                queue.add(nodeP.right);
                queue.add(nodeQ.right);
            } else if (nodeP != null || nodeQ != null) { // If both are null it is OK, otherwise NOK.
                return false;
            }
        }
        return true;
    }
}