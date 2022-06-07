/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

409. Longest Palindrome

https://leetcode.com/problems/longest-palindrome/

*/

/*
TC : O(s)
SC : O(s)
*/
class Solution {
    public int longestPalindrome(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            map.put(c , map.getOrDefault(c, 0)+1);
        }
        
        int oddValue = 0, result = 0;
        
        for (Character key : map.keySet()) {
            
            int value = map.get(key);
            result += value;
            if (value%2!=0) {
                result -= 1;
                oddValue = 1;
            }
            
            
        }
        
        result += oddValue;
        return result;
        
    }
}