/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

169. Majority Element

https://leetcode.com/problems/majority-element/

*/

/*
TC : O(n)
SC : O(1)
*/
class Solution {

	/*
	Alternate Solution :

		Arrays.sort(nums);
        return nums[(nums.length)/2];

	*/

    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}