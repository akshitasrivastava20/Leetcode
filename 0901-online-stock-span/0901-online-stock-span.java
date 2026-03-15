class StockSpanner {
    Stack<int[]> st=new Stack<>();
    
    public StockSpanner() {
        st=new Stack<>();
       
        
    }
    
    public int next(int price) {
        int span=1;
        while(!st.isEmpty()&&st.peek()[0]<=price){
            span+=st.peek()[1];
            st.pop();
        }
        int[] arr={price,span};
        st.push(arr);
        return span;
      
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */