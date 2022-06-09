/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

141. Linked List Cycle

https://leetcode.com/problems/linked-list-cycle/

*/

/*
TC : O(n)
SC : O(1)
*/
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode slow = head, fast = head;
        
        
        while (slow != null && fast != null) {
            
            slow = slow.next;
            fast = fast.next;
            if (fast == null)
                break;
            fast = fast.next;
            if(slow == fast)
                return true;
            
        }
        
        return false;
        
    }
}
