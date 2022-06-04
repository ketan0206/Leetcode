/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

242. Valid Anagram

https://leetcode.com/problems/valid-anagram/

*/

/*
TC : O(s + t)
SC : O(1)
*/
class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s == null || t == null || s.length() != t.length())
            return false;
        
        int[] count = new int[26];
        
        for (char c : s.toCharArray()) {
            count[c-'a']++;
        }
        
        for (char c : t.toCharArray()) {
            count[c-'a']--;
        }
        
        for (int i : count) {
            if (i != 0)
                return false;
        }
        
        return true;
        
    }
}
