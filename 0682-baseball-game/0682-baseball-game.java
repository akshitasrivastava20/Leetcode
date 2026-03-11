class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int top1=st.peek();
                st.pop();
                int top2=st.peek();
                st.push(top1);

                st.push(top1+top2);
            }
            else if(operations[i].equals("D")){
                int top=st.peek();
                st.push(2*top);

            }
            else if(operations[i].equals("C")){
                st.pop();
            }
            else{
                int a=Integer.parseInt(operations[i]);
                st.push(a);
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
       
    }
}