class Solution {
    public boolean isHappy(int n) {
        int s=n;
        int f=n;
        do{
            s=squared(s);
            f=squared(squared(f));
            
        }while(s!=f);
        return s==1;


        
    }
    static int squared(int n){
        int sum=0;
        while(n>0){

            int d=n%10;
            sum+=d*d;
            n=n/10;
        }
        return sum;
    }
}