class MyQueue {
    Stack<Integer> st = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
       st.push(x); 
    }
    
    public int pop() {
        Stack<Integer> temp = new Stack<>();
        while(st.isEmpty() == false)
        {
            temp.push(st.peek());
            st.pop();
        }
        int res = temp.peek();
        temp.pop();
         while(temp.isEmpty() == false)
        {
            st.push(temp.peek());
            temp.pop();
        }
        return res;
    }
    
    public int peek() {
        Stack<Integer> temp = new Stack<>();
        while(st.isEmpty() == false)
        {
            temp.push(st.peek());
            st.pop();
        }
        int res = temp.peek();
         while(temp.isEmpty() == false)
        {
            st.push(temp.peek());
            temp.pop();
        }
        return res;
    }
    
    public boolean empty() {
        return st.isEmpty();
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