class MyStack {
    Queue<Integer> q = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
       int n = q.size();
        int i=1;
        int res = 0;
        while(i<=n)
        {
            if(i==n)
            {
                res = q.peek();
                q.poll();
            }
            else
            {
                q.add(q.peek());
                res = q.peek();
                q.poll();
            }
            i++;
        }
        return res; 
    }
    
    public int top() {
       int n = q.size();
        int i=1;
        int res = 0;
        while(i<=n)
        {
            q.add(q.peek());
            res = q.peek();
            q.poll();
            i++;
        }
        return res; 
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */