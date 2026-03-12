class MyQueue {
     Stack<Integer> st1;
     Stack<Integer> st2;

    public MyQueue() {
        st1=new Stack<>();
        st2=new Stack<>();
    }
    
    public void push(int x) {
        st1.push(x);
        
    }
    
    public int pop() {
        int n=st1.size();
        for(int i=0;i<n;i++){
            st2.push(st1.pop());

        }
        int t=st2.pop();
         for(int i=0;i<n-1;i++){
            st1.push(st2.pop());

        }
        return t;


        
    }
    
    public int peek() {
         int n=st1.size();
        for(int i=0;i<n;i++){
            st2.push(st1.pop());

        }
        int t=st2.peek();
         for(int i=0;i<n;i++){
            st1.push(st2.pop());

        }
        return t;
        
    }
    
    public boolean empty() {
        return st1.isEmpty();
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