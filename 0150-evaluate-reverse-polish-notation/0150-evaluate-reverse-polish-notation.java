class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> t=new Stack<>();
        for(String s:tokens){
            if("+-*/".contains(s)){
                int a=t.pop();
                int b=t.pop();
                if(s.equals("+")) t.push(b+a);
                else if(s.equals("-")) t.push(b-a);
                else if(s.equals("*")) t.push(b*a);
                else if(s.equals("/")) t.push(b/a);

            }
            else{
            t.push(Integer.valueOf(s));}
            
        }
        if(t.isEmpty())return 0;
        return t.peek();
    }
}