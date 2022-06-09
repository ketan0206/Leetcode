/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

234. Palindrome Linked List

https://leetcode.com/problems/palindrome-linked-list/


/*
TC : O(n)
SC : O(n)

*?

*/

class Solution {
    public boolean isPalindrome(ListNode head) {
        
        Deque<ListNode> dq = new ArrayDeque<>();
        
        ListNode curr = head;
        
        while (curr != null) {
            dq.push(curr);
            curr = curr.next;
        }
        
        curr = head;
        
        while (!dq.isEmpty()) {
            if (curr.val != dq.pop().val)
                return false;
            curr = curr.next;
        }
        return true;
    }
}