class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String str:arr){
            sb.append(rev(str)).append(" ");
            
        }
        return sb.toString().trim();

        
    }
    private String rev(String str){
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();
    }
}