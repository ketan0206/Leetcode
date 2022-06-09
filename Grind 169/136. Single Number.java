/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

136. Single Number

https://leetcode.com/problems/single-number/


/*
TC : O(n)
SC : O(1)

*?

*/

class Solution {
    public int singleNumber(int[] nums) {
        /*
        Set<Integer> set = new HashSet<>();
        
        for (int i : nums) {
            if (set.contains(i))
                set.remove(i);
            else
                set.add(i);
        }
        return set.iterator().next();
        */
        int a = 0;
        
        for (int i : nums)
            a = a^i;
        
        return a;
    }
}