class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans=new int[temperatures.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty()&&temperatures[i]>temperatures[st.peek()]){
                ans[st.peek()]=i-st.peek();
                st.pop();

            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.peek()]=0;
            st.pop();
        }
        return ans;

    }
}