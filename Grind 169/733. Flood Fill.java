/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

733. Flood Fill

https://leetcode.com/problems/flood-fill/solution/

*/

/*
TC : O(n) -> n is number of pixels or cells in image.
SC : O(n) -> for call stack.
*/
class Solution {
// dfs solution
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor) dfs(image, sr, sc, color, newColor);
        return image;
    }
    public void dfs(int[][] image, int r, int c, int color, int newColor) {
        if (image[r][c] == color) {
            image[r][c] = newColor;
            if (r >= 1) dfs(image, r-1, c, color, newColor);
            if (c >= 1) dfs(image, r, c-1, color, newColor);
            if (r+1 < image.length) dfs(image, r+1, c, color, newColor);
            if (c+1 < image[0].length) dfs(image, r, c+1, color, newColor);
        }
    }
}


/*

class Solution {
    // bfs solution

    int[] xMoves = {1,-1,0,0};
    int[] yMoves = {0,0,1,-1};
    int newColor;
    int xMax;
    int yMax;
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        this.newColor = newColor;
        this.xMax = image.length;
        this.yMax = image[0].length;
        //int[][] visited = new int[image.length][image[0].length];
        if (image[sr][sc]!=newColor) transform(image, sr, sc, image[sr][sc]);
        return image;
    }
    
    private void transform (int[][] image, int x, int y, int color) {
        
        if (isValid(x,y) && image[x][y]==color) {
            image[x][y] = newColor;
            //visited[x][y] = 1;
            for (int i = 0 ; i < 4 ; i++) {
                transform(image, x+xMoves[i], y+yMoves[i], color);
            }
        }
        
    }
    
    private boolean isValid(int x, int y) {
        if (x<0 || x>=xMax || y < 0 || y>=yMax) return false;
        return true;
    }
    
}


*/