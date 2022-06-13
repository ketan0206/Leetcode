/*
Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17
3. Longest Substring Without Repeating Characters
https://leetcode.com/problems/longest-substring-without-repeating-characters/
*/


class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        
        int prev = -1;
        int result = 0;
        
        for (int i = 0 ; i < s.length() ; i++) {
            Integer value = map.get(s.charAt(i));
            
            if (value!=null) {
                prev = Math.max(prev, value);
            }
            result = Math.max(result, i - prev);
            map.put(s.charAt(i), i);
                
        }
        return result;
    }
}