class Solution {
    public int compress(char[] chars) {
        int c;
        int i=0;
        int idx=0;
        while(i<chars.length){
            char curr=chars[i];
            c=0;
            while(i<chars.length&&chars[i]==curr){
                c++;i++;
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