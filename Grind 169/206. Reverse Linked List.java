/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

206. Reverse Linked List

https://leetcode.com/problems/reverse-linked-list/

*/

/*
TC : O(n)
SC : O(n) -> for call stack.
*/
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if (head == null || head.next == null )
            return head;
        
        ListNode result = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return result;
        
    }
}