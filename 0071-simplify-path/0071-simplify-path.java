class Solution {
    public String simplifyPath(String path) {
       Stack<String> t=new Stack<>();
        String[] strs=path.split("/+");
        for(int i=0;i<strs.length;i++){
            if(strs[i].equals("..")){
                if(!t.isEmpty())t.pop();
            }
            else if(strs[i].equals(".")||strs[i].equals("")){
                continue;
            }
            else{
                t.push(strs[i]);}
  
        }

        if(t.isEmpty()) return "/";
       String result="/"+String.join("/",t); 
       return result;

    }
}