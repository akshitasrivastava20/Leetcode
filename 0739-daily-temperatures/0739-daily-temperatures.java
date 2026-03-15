class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] day=new int[temperatures.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty()&&temperatures[i]>temperatures[st.peek()]){
                day[st.peek()]=i-st.peek();
                st.pop();
            }
            st.push(i);
        }
        return day;

    }
}