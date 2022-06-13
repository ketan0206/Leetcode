
/*
120. Triangle

https://leetcode.com/problems/triangle/
*/

/*
TC : 
SC : 
*/
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        // How did you come to know that this question would be solved using dynamic programming ? As you can see,
        // the option you choose in current row would impact the next row as reach is only for i and i+1 of next 
        // row. There could be an element in any row which is away from i or i+1 value but results in overall 
        // decreased path.

        for(int i = triangle.size() - 2; i >= 0; i--)
            for(int j = 0; j <= i; j++)
                triangle.get(i).set(j, triangle.get(i).get(j) + Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1)));
        return triangle.get(0).get(0);

    }
}