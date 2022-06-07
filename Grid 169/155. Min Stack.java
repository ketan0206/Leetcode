/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

155. Min Stack

https://leetcode.com/problems/min-stack/

*/

/*
TC : 
	push : O(1), pop : O(1), top : O(1), getMin : O()
SC : O(1)
*/
class MinStack {
    private Node head;
    
    public MinStack() {
        head = null;
    }
    
    public void push(int val) {
        if (head == null) {
            head = new Node(val, val, null);
        } else {
            head = new Node(val, Math.min(val, head.min), head);
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
    
    private class Node {
        int val;
        int min;
        Node next;
        
        public Node (int val, int min, Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
    
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */