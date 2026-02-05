class Solution {
    public boolean isPalindrome(int x) {

        if(x<0) return false;
        int y=x;
        int n=0;int d=0;
        while(x!=0){
             d=x%10;
             n=n*10+d;
             x=x/10;
        }
        return y==n;

    }
}