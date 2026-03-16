class Solution {
    public String simplifyPath(String path) {
        String[] simple=path.split("/+");
        StringBuilder sb=new StringBuilder();
        Stack<String> st=new Stack<>();
        for(String s:simple){
           
           if(s.equals(".")||s.equals("")) continue;
           else if(s.equals("..")) {
            if(!st.isEmpty())st.pop();}
     
            else st.push(s);
        }
        while(!st.isEmpty()){
           
            sb.insert(0,"/"+st.pop());
        }
      
       
        return (sb.length()==0)?"/":  sb.toString();


    }
}