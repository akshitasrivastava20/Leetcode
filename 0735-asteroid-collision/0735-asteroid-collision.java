class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack();
        List<Integer> ans=new ArrayList<>();
        for(int a:asteroids){
            //new no is pos
            if(a>0||a<0 &&!st.isEmpty()&&st.peek()<0){
                st.push(a);
            }
            //new no is neg and prev is pos
            else if(a<0){
                   while(!st.isEmpty() && st.peek() > 0 && Math.abs(a) > Math.abs(st.peek())){
                    st.pop();
                }
                if(st.isEmpty()||st.peek()<0) st.push(a);
                
                else if(Math.abs(a) == Math.abs(st.peek())){
                    st.pop(); // both destroyed
                }
                 
            }
            
        }
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        Collections.reverse(ans);
        int[] arr = ans.stream()
                .mapToInt(i -> i)
                .toArray();
        return arr;        

    }
}