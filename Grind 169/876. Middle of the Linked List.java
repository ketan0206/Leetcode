/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

876. Middle of the Linked List

https://leetcode.com/problems/middle-of-the-linked-list/

*/

/*
TC : O(n)
SC : O(1)
*/
class Solution {
    public ListNode middleNode(ListNode head) {
        
        ListNode slow = head, fast = head;
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}