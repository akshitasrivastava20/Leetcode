class Solution {
    public String simplifyPath(String path) {
       List<String> lst=new ArrayList<>();
        String[] strs=path.split("/+");
        for(int i=0;i<strs.length;i++){
            if(strs[i].equals("..")){
                if (!lst.isEmpty()) {
                    lst.remove(lst.size() - 1);
                }
            }
            else if(strs[i].equals(".")||strs[i].equals("")){
                continue;
            }
            else{
                lst.add(strs[i]);}
  
        }

        if(lst.size()==0) return "/";
       String result="/"+String.join("/",lst); 
       return result;

    }
}