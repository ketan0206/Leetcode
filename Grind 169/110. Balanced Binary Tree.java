/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

110. Balanced Binary Tree

https://leetcode.com/problems/balanced-binary-tree/

*/

/*
TC : O(n)
SC : O(1)
*/
class Solution {
    boolean bal=true;
    public boolean isBalanced(TreeNode root) {
        
        height(root);
        return bal;
    }
    
    private int height(TreeNode root) {
        if (root==null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left-right)>1) bal=false;
        return Math.max(left, right) + 1;
    }
}
