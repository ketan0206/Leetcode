/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

217. Contains Duplicate

https://leetcode.com/problems/contains-duplicate/

*/

/*
TC : O(n)
SC : O(n)
*/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        for (int i : nums)
            set.add(i);
        return set.size() != nums.length ;
    }
}