/*

304. Range Sum Query 2D - Immutable

https://leetcode.com/problems/range-sum-query-2d-immutable/

Refer to this solution article, read through all approaches, caching rows using 1 D version and caching as 2 D version are good solutions.
Trading off space to better time complexity and pre computation.

*/

/*
TC : O(1) time per query, O(mn)O(mn) time pre-computation. The pre-computation in the constructor takes O(mn)O(mn) time. Each sumRegion query takes O(1)O(1) time.
SC : O(m*n)
*/
class NumMatrix {
	// dp solution
    int[][] dp;
    
    public NumMatrix(int[][] matrix) {
        
        if (matrix.length == 0 || matrix[0].length == 0)
            return;
        
        dp = new int [matrix.length + 1][matrix[0].length + 1];
        for (int r = 0 ; r < matrix.length ; r++) {
            for (int c = 0 ; c < matrix[0].length ; c++) {
                dp[r+1][c+1] = dp[r+1][c] + dp[r][c+1] + matrix[r][c] - dp[r][c];
            }
        }
        
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        
        return dp[row2 + 1][col2 + 1] - dp[row1][col2 + 1] - dp[row2 + 1][col1] + dp[row1][col1];
        
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */