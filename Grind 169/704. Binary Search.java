/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

704. Binary Search

https://leetcode.com/problems/binary-search/

*/

/*
TC : O(Log n)
SC : O(1)
*/
class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(0, nums.length-1 , target, nums);
    }
    
    private int binarySearch (int start, int end, int target, int[] nums) {
        
        while (start <= end) {
            
            int mid = start + (end - start)/2;
            
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            
        }
        
        return -1;
    }
}
