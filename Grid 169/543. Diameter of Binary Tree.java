/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

543. Diameter of Binary Tree

https://leetcode.com/problems/diameter-of-binary-tree/

*/

/*
TC : O(n)
SC : O(n) -> call stack
*/
public class Solution {
    int max = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }
    
    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        max = Math.max(max, left + right);
        
        return Math.max(left, right) + 1;
    }
}