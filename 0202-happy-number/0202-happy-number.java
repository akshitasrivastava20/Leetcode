class Solution {
    public boolean isHappy(int n) {
       int s=n;
       int f=n;
       do{
        s=squared(s);
        f=squared(squared(f));
        if(s==1) return true;
       }while(f!=s);
       return false;
       

    }
    public int squared(int num){
        int ans=0;
        while(num>0){
            int r=num%10;
        ans+=r*r;
        num=num/10;
        }
        return ans;
        
    }

}