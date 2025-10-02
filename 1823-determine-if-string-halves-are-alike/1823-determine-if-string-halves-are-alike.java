class Solution {
    public boolean halvesAreAlike(String s) {
        String a=s.substring(0,s.length()/2);
        String b=s.substring(s.length()/2);
        int c=0;
        int k=0;
        for(int i=0;i<s.length()/2;i++){
            if(isVowel(a.charAt(i))){
                c++;
            }
             if(isVowel(b.charAt(i))){
                k++;
            }
            
        }
        if(c==k) return true;
        else return false;
        
    }

    static boolean isVowel(char ch){
        char[] vow={'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for(int i=0;i<vow.length;i++){
            if(vow[i]==ch) return true;
        }
        return false;
    }
}