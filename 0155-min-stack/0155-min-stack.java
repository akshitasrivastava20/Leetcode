class MinStack {
    Stack<Integer> st1;
    Stack<Integer> st2;

    public MinStack() {
        st1=new Stack<>();//to tracj all the ele
         st2=new Stack<>();//to track min

        
    }
    
    public void push(int value) {
        st1.push(value);
        if(st2.isEmpty()||value<=st2.peek()) st2.push(value);
        
    }
    
    public void pop() {
        int t=st1.pop();
        if(!st2.isEmpty()&& t==st2.peek()) st2.pop();
        
    }
    
    public int top() {
        return st1.isEmpty()?-1:st1.peek();
        
    }
    
    public int getMin() {
        return (st2.isEmpty())?-1:st2.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */