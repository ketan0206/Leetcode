/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

125. Valid Palindrome

https://leetcode.com/problems/valid-palindrome/

*/

/*
TC : O(n)
SC : O(1)
*/
class Solution {
    public boolean isPalindrome(String s) {
        
        String str = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        System.out.print(str);
        int i = 0 , j = str.length() - 1;
        
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        
        return true;
        
    }
}
