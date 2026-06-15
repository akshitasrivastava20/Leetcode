class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] temp=new int[temperatures.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<temperatures.length;i++){
               while(!st.isEmpty()&&temperatures[st.peek()]<temperatures[i]){
                 temp[st.peek()]=i-st.peek();
                 st.pop();

                }
                st.push(i);
               

        }
        while(!st.isEmpty()){
            temp[st.pop()]=0;
        }
        return temp;
    }
}