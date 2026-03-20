class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] r=rsmall(heights);
        int[] l=lsmall(heights);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            int area=heights[i]*(r[i]+l[i]+1);
            max=Math.max(max,area);

        }
        return max;
        
    }
    private int[] rsmall(int[] heights){
        Stack<Integer> st=new Stack<>();
        int[] r=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty()&&heights[i]<heights[st.peek()]){
                r[st.peek()]=i-st.peek()-1;
                st.pop();


            }
            st.push(i);
        }
         while(!st.isEmpty()){
            int idx=st.pop();
            r[idx]=heights.length-idx-1;
        }
        return r;


    }
    private int[] lsmall(int[] heights){
        Stack<Integer> st=new Stack<>();
        int[] l=new int[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            while(!st.isEmpty()&&heights[i]<heights[st.peek()]){
                l[st.peek()]=st.peek()-i-1;
                st.pop();


            }
            st.push(i);
        }
        while(!st.isEmpty()){
             int idx=st.pop();
            l[idx]=idx;
        }
        return l;
        

    }
}