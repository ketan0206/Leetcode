/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

383. Ransom Note

https://leetcode.com/problems/ransom-note/

*/

/*
TC : O(n+m)
SC : O(1)
*/
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] count = new int[26];
        
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }
        
        for (char c : ransomNote.toCharArray()) {
            count[c - 'a']--;
        }
        
        for (int i = 0 ; i < 26 ; i++) {
            if (count[i]<0)
                return false;
        }
        return true;
        
    }
}