/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

235. Lowest Common Ancestor of a Binary Search Tree

https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

*/

/*
TC : O(log n)
SC : O(1)
*/
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }else if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }else{
            return root;
        }
    }
}
