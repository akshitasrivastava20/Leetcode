class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pre=strs[0];
        //find the shortest string
        for(String str:strs){
            if(str.length()<pre.length()){
                pre=str;
            }
        }

        for(String str:strs){
            while(!str.startsWith(pre)) pre=pre.substring(0,pre.length()-1);


        }
        return pre;

        
    }
}