/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

1. Two Sum

https://leetcode.com/problems/two-sum/

*/

/*
TC : O(n)
SC : O(n)
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0 ; i < nums.length ; i++) {
            if (map.containsKey(target-nums[i])) {
                return new int[] {i, map.get(target-nums[i])};
            } else {
                map.put(nums[i], i);
            }
        }
        
        return null;
    }
}
