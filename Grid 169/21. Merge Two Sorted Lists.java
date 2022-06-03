/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

21. Merge Two Sorted Lists

https://leetcode.com/problems/merge-two-sorted-lists/

*/

/*
TC : O(n+m)
SC : O(1)
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode result = new ListNode();
        ListNode curr = result;
        
        while (l1 != null && l2 != null) {
            int a = l1.val;
            int b = l2.val;
            if (a<b) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
            curr.next = null; // important step to cut connection of node from existing linked list.
        }
        
        curr.next = l1 == null ? l2 : l1; // nice way to append one of the remaining two linked list of result.
        
        return result.next;
        
    }
}
