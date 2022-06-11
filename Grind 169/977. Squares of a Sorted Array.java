/*
Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

977. Squares of a Sorted Array
https://leetcode.com/problems/squares-of-a-sorted-array/
*/

/*
TC : O(n)
SC : O(n)
*/
class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int i = 0, j = nums.length - 1;
        int k = nums.length - 1;
        
        int[] result = new int[nums.length];
        while (i<=j) {
             if (Math.abs(nums[i])<Math.abs(nums[j])) {
                  result[k] = nums[j]*nums[j];
                 j--;
             } else {
                 result[k] = nums[i]*nums[i];
                 i++;
             }
            k--;
        }
        return result;
    }
}