/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

70. Climbing Stairs

https://leetcode.com/problems/climbing-stairs/

*/

/*
TC : O(n)
SC : O(1)
*/
class Solution {
    public int climbStairs(int n) {
    int a = 1, b = 1;
    while (n-- > 0)
        a = (b += a) - a;
    return a;
}
}