/*

867. Transpose Matrix

https://leetcode.com/problems/transpose-matrix/

*/

/*
TC : O(r*c)
SC : O(r*C)
*/
class Solution {
    public int[][] transpose(int[][] matrix) {
        
        if (matrix == null || matrix.length == 0)
            return matrix;
        
        int[][] result = new int[matrix[0].length][matrix.length];
        
        for (int i = 0 ; i < matrix.length ; i++) {
            for (int j = 0 ; j < matrix[0].length ; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
