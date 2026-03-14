class MinStack {
    Stack<Integer> st1;//all values
    Stack<Integer> st2;//track min
    

    public MinStack() {
        st1=new Stack<>();
        st2=new Stack<>();
        
        
    }
    
    public void push(int val) {
        st1.push(val);
        if(st2.isEmpty()||val<=st2.peek()){
            st2.push(val);
        }

        
    }
    
    public void pop() {
        int t=st1.pop();
        if(!st2.isEmpty()&&t==st2.peek()){
            st2.pop();
        }
        
    }
    
    public int top() {
        return (st1.isEmpty())?-1:st1.peek();
        
    }
    
    public int getMin() {
         return (st2.isEmpty())?-1:st2.peek();

        
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