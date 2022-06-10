/*
Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

108. Convert Sorted Array to Binary Search Tree
https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
*/


/*
TC : O(N)
SC : O(1)
*/

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return convert(nums, 0, nums.length-1);
    }
       
    private TreeNode convert (int[] nums, int low, int high) {
        
        if (low > high)
            return null;
        
        int mid = low + (high-low)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = convert(nums, low, mid-1);
        node.right = convert(nums, mid+1, high);
        
        return node;       
    } 
}