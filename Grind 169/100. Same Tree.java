/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

100. Same Tree

https://leetcode.com/problems/same-tree/

*/

/*
TC : O(n) where N is a number of nodes in the tree, since one visits each node exactly once.
SC : O(log(n)) in the best case of completely balanced tree and O(n) in the worst case of completely unbalanced tree, to keep a recursion stack.
*/
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

    	// solution : both recursive and iterative.
    	// https://leetcode.com/problems/same-tree/solution/
        
        if (p == null && q == null)
            return true;
        
        if (p == null || q == null)
            return false;
        
        if (p.val != q.val)
            return false;
        
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        
    }
}
