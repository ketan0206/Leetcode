/*
Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

268. Missing Number
https://leetcode.com/problems/missing-number/
*/


/*
TC : O(N)
SC : O(1)
*/

class Solution {
    public int missingNumber(int[] nums) {
        
        int sum = 0;
        
        for (int i : nums) {
            sum += i;
        }
        
        return ((nums.length+1)*(nums.length)/2 - sum) ;
        
    }
}