/*
Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

542. 01 Matrix

https://leetcode.com/problems/01-matrix/
*/

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        if ( m  == 0 ){
            return mat;
        }
        int [][]result = new int[m][n];
        class Pair{
            int row;
            int col;
            public Pair(int r, int c){
                row = r;
                col = c;
            }
        }
        Queue <Pair> q = new LinkedList<>();
        
        for ( int i = 0 ; i < m ; i++){
            for(int j = 0 ; j< n ; j++){
                if(mat[i][j] == 0){
                    result[i][j] = 0;
                    q.add(new Pair(i, j));
                }else{
                    result[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        
        int [][]dir = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        while(!q.isEmpty()){
            Pair p = q.remove();
            for(int i = 0 ; i < 4 ; i++){
                int row = p.row + dir[i][0];
                int col = p.col + dir[i][1];
                if(row >= 0 && row < m && col >= 0 && col < n){
                   if(result[row][col] > result[p.row][p.col] + 1){
                       result[row][col] = result[p.row][p.col] + 1;
                       q.add(new Pair(row, col));
                   } 
                }
                
            }
        }
        return result;
    }
}