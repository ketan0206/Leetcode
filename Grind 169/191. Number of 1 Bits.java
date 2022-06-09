/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

191. Number of 1 Bits

https://leetcode.com/problems/number-of-1-bits/

*/

class Solution {
    public static int hammingWeight(int n) {
    // Solution : https://leetcode.com/problems/number-of-1-bits/discuss/55099/Simple-Java-Solution-Bit-Shifting
    int c = 0;
    while (n != 0) {
        c += (n & 1);
        n >>>= 1;
    }
    return c;
}
}
