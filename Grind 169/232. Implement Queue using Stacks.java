/*

Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

232. Implement Queue using Stacks

https://leetcode.com/problems/implement-queue-using-stacks/

*/

/*
TC : 
    For push() : O(1)
    For pop() : O(n)
    For peek() : O(n)
    For empty() : O(1)
SC : O(n)
*/
class MyQueue {

    Deque<Integer> stack1;
    Deque<Integer> stack2;
    
    
    /** Initialize your data structure here. */
    public MyQueue() {
        
        stack1 = new ArrayDeque<>();
        stack2 = new ArrayDeque<>();
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        
        int x = 0;
        if(!stack2.isEmpty()) {
            x = stack2.pop();
        }
        
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        
        return x;
    }
    
    /** Get the front element. */
    public int peek() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        
        int x = 0;
        if(!stack2.isEmpty()) {
            x = stack2.peek();
        }
        
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        
        return x;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
