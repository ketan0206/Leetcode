/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

53. Maximum Subarray

https://leetcode.com/problems/maximum-subarray/

*/

/*
TC : O(n)
SC : O(1)
*/
class Solution {
    public int maxSubArray(int[] nums) {
        
        
        
        int max = nums[0];
        int interimMax = nums[0];
        
        for (int i = 1 ; i < nums.length ; i++) {
            interimMax = Math.max(interimMax + nums[i], nums[i]);
            max = Math.max(max, interimMax);
        }
        return max;
    }
}
