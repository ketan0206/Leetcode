/*

52. N-Queens II

https://leetcode.com/problems/n-queens-ii/

*/

/*
TC : O(n)
SC : O(n+2*n+2*n) = O(n) 
*/
class Solution {
    int count = 0;
    boolean[] cols;
    boolean[] d1;
    boolean[] d2;
    public int totalNQueens(int n) {
        cols = new boolean[n];
        d1 = new boolean[2*n];
        d2 = new boolean[2*n];
        backtrack(0, n);
        return count;
    }
    
    private void backtrack(int row, int n) {
        if (row==n) count++;
        for (int col = 0 ; col < n ; col++) {
            if (cols[col] || d1[row+col] || d2[row-col+n]) {
                continue;
            }
            cols[col] = true; d1[row+col] = true; d2[row-col+n] = true;
                
            
            backtrack(row+1, n);
            cols[col] = false; d1[row+col] = false; d2[row-col+n] = false;
        }
    }
}
