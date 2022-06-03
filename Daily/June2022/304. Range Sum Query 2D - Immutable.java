/*

304. Range Sum Query 2D - Immutable

https://leetcode.com/problems/range-sum-query-2d-immutable/

Refer to this solution article, read through all approaches, caching rows using 1 D version and caching as 2 D version are good solutions.
Trading off space to better time complexity and pre computation.

*/

/*
TC : O(r*c)
SC : O(1)
*/
class NumMatrix {

    int[][] mat;
    
    public NumMatrix(int[][] matrix) {
        
        mat = matrix;
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        
        int sum = 0;
        
        for (int i = row1 ; i <= row2 ; i++) {
            for (int j = col1 ; j <= col2 ; j++) {
                sum += mat[i][j];
            }
        }
        
        return sum;
        
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */