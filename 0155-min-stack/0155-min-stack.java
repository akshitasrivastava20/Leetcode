class MinStack {
    Stack <Integer> t;
    List<Integer> lst;

    public MinStack() {
        t=new Stack<>();
        lst=new ArrayList<>();
    }
    
    public void push(int val) {
        t.push(val);
        lst.add(val);
        
    }
    
    public void pop() {
        t.pop();
        lst.remove(lst.size()-1);
        
    }
    
    public int top() {
       return  t.peek();
       
    }
    
    public int getMin() {
        return Collections.min(lst);
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