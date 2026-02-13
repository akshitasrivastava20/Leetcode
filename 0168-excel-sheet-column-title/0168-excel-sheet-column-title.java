class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            int d=columnNumber%26;
            sb.append((char)(d+'A'));
            columnNumber=columnNumber/26;
        }
        return sb.reverse().toString();
        
    }
}