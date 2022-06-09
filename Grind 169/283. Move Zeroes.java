/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

283. Move Zeroes

https://leetcode.com/problems/move-zeroes/


/*
TC : O(n)
SC : O(1)

*?

*/

class Solution {
    public void moveZeroes(int[] nums) {
        
        int slow = 0, fast = 0;
        
        while (fast < nums.length) {
            
            if (nums[fast]!=0) {
                nums[slow++] = nums[fast];
            }
            fast++;
        }
        
        while (slow < nums.length) {
            
            nums[slow++] = 0;
        }
        
    }
}