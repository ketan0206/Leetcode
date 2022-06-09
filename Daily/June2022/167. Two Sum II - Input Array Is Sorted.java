/*
167. Two Sum II - Input Array Is Sorted
https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
*/

/*
TC : O(n)
SC : O(1)
*/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int left = 0, right = numbers.length - 1;
        
        while (left < right) {
            
            if (numbers[left]+numbers[right] < target)
                left++;
            if (numbers[left]+numbers[right] > target)
                right--;
            
            if (numbers[left]+numbers[right] == target)
                return new int[] {left+1,right+1};
            
        }
        return null;
    }
}