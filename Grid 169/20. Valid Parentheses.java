/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

20. Valid Parentheses

https://leetcode.com/problems/valid-parentheses/

*/

/*
TC : O(n)
SC : O(n)
*/
class Solution {
    public boolean isValid(String s) {
        
        Deque<Character> dq = new ArrayDeque<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                dq.push(c);
            else {
                if (dq.isEmpty())
                    return false;
                char value = dq.pop();
                if (c == ')') {
                    if (value!='(')
                        return false;
                } else if (c == '}') {
                    if (value!='{')
                        return false;
                } else if (c == ']') {
                    if (value!='[')
                        return false;
                }
            }
        }
        return dq.isEmpty();   // very important step, do not forget.
    }
}
