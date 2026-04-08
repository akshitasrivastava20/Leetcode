class Solution {
    public double myPow(double x, int n) {

        double result=1;
        long N=n;
        if(N<0){
            x=1/x;
            N=-N;
        }
        while(N>0){
            if((N&1)==1){
                result*=x;
            }
            x=x*x;
            N=N>>1;
        }
        return result;
    }
}