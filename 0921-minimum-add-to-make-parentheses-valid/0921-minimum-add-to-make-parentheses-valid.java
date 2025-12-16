class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack=new Stack<>();
        int c=0;

        for(char ch:s.toCharArray()){
            
            if(ch==')'&&(!stack.isEmpty())&&stack.peek()=='(')
            { stack.pop();}
             else{
                stack.push(ch);
            }

        }
        while(!stack.isEmpty()){
            stack.pop();
            c++;
        }

        return c;
    }
}