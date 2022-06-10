/*
3. Longest Substring Without Repeating Characters
https://leetcode.com/problems/longest-substring-without-repeating-characters/
*/

/*
TC : O(n)
SC : O(n)
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
