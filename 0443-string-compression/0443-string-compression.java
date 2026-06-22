class Solution {
    public int compress(char[] chars) {
        int i=0;int c;int idx=0;
        while(i<chars.length){
            char curr=chars[i];
            c=0;
            while(i<chars.length&&chars[i]==curr){
                i++;c++;

            }
            chars[idx++]=curr;
            if(c>1){
                for(char ch:String.valueOf(c).toCharArray()){
                    chars[idx++]=ch;
                }
            }
        }
        return idx;
        
    }
}