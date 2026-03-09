class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] lmax= new int[height.length];
        lmax[0]=0;
        int[] rmax= new int[height.length];
        rmax[n-1]=0;
        int[] ans= new int[height.length];
        int sum=0;

        for(int i=1;i<height.length;i++){
            lmax[i]=Math.max(height[i-1],lmax[i-1]);
            
        }
        for(int i=n-2;i>=0;i--){
            rmax[i]=Math.max(height[i+1],rmax[i+1]);
            
        }
        for(int i=0;i<height.length;i++){
            ans[i]=Math.min(lmax[i],rmax[i])-height[i];
            if(ans[i]>0) sum+=ans[i];
        }
        return sum;
    }
}