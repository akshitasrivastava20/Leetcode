class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb=new StringBuilder();int c=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='-') continue;
            sb.append(Character.toUpperCase(s.charAt(i)));
            c++;
            if(c==k){
                sb.append('-');
                c=0;

            }
            
            



        }
        String str= sb.reverse().toString();
        if(str.length()>0&&str.charAt(0)=='-') return str.substring(1,str.length());
        return str;
        
    }
}