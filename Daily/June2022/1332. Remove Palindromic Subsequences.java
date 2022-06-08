/*
1332. Remove Palindromic Subsequences
https://leetcode.com/problems/remove-palindromic-subsequences/
*/

/*
TC : O(n)
SC : O(1)
*/
class Solution {
    public int removePalindromeSub(String s) {
        
        // Two hints given below the question, helped me solve this question with this logic.
        // Logic : if the input string is palindrome it can be removed in one go, if not palindrome then to have minimum efforts 
        // remove all characters of same value (i.e. a or b) and then the other left one, so only 2 times removal required.

        if (s == null || s == "")
            return 0;
        
        int i = 0, j = s.length() - 1;
        
        while (i < j) {
            if (s.charAt(i++)!=s.charAt(j--))
                return 2;
        }
        return 1;
    }
}