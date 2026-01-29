class Solution {
    public boolean isValid(String s) {
        Stack<Character> t=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                t.push(ch);
            

            }
            else{
                if(t.isEmpty()) return false;
                else{
                char p=t.peek();
                if((ch==')'&& p=='(')||(ch=='}'&& p=='{')||(ch==']'&&p=='[')) t.pop();
                else t.push(ch);}

            }
        }
        if(t.isEmpty()) return true;
        return false;
    }
}