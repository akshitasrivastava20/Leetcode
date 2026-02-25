class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        int i=0;int j=s.length()-1;
        while(i<=j){
            while("aeiouAEIOU".indexOf(ch[i])==-1&&i<j) i++;
            while("aeiouAEIOU".indexOf(ch[j])==-1&&i<j) j--;

             char temp=ch[i];
             ch[i]=ch[j];
             ch[j]=temp;
             i++;j--;

             if(i>=j) break;


        }
        return new String(ch);
    }
}