/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

338. Counting Bits

https://leetcode.com/problems/counting-bits/

*/

/*
TC : O(n)
SC : O(n)
*/
class Solution {
    public int[] countBits(int num) {
        
        int[] result = new int[num+1];
        
        for (int i = 1 ; i <= num ; i++) {
            //result[i] = result[i&(i-1)] + 1; alternate solution.
            result[i] = result[i/2] + i%2;
        }
        
        return result;
    }
}
