/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

104. Maximum Depth of Binary Tree

https://leetcode.com/problems/maximum-depth-of-binary-tree/

*/

/*
TC : O(n)
SC : O(n) -> call stack
*/
class Solution {
    public int maxDepth(TreeNode root) {
        if (root==null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        //return bfs(root);
    }
    
    /* Iterative Approach, way slower than recursive.
    private int bfs (TreeNode root) {
        Deque<TreeNode> dq = new ArrayDeque<>();
        dq.offer(root);
        int count = 0;
        
        while(!dq.isEmpty()) {
            int n = dq.size();
            for (int i = 0 ; i < n ; i++) {
                TreeNode tn = dq.poll();
                if (tn.left!=null) dq.offer(tn.left);
                if (tn.right!=null) dq.offer(tn.right);
            }
            count++;
        }
        return count;
    }
    */
}