/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

13. Roman to Integer

https://leetcode.com/problems/roman-to-integer/

*/

/*
TC : O(n)
SC : O(n)
*/
class Solution {
    public int romanToInt(String s) {
        if (s.isEmpty()) return 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int prev = map.get(s.charAt(0));
        int sum = map.get(s.charAt(0));
        for (int i = 1 ; i < s.length() ; i++) {
            int value = map.get(s.charAt(i));
            sum += value;
            if (value>prev) sum = sum - (2*prev);
            prev = value;
        }
        return sum;
    }
}