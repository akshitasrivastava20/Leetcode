class Solution {
    public int trap(int[] height) {
       int[] lmax=new int[height.length];
       int[] rmax=new int[height.length];
        int[] area=new int[height.length];
       lmax[0]=height[0]; 
       for(int i=1;i<height.length;i++){
            lmax[i]=Math.max(height[i],lmax[i-1]);
       }
       rmax[height.length-1]=height[height.length-1];
       for(int i=height.length-2;i>=0;i--){
        rmax[i]=Math.max(height[i],rmax[i+1]);
       }
       for(int i=0;i<height.length;i++){
           area[i]=Math.min(lmax[i],rmax[i])-height[i];
       }
       int ans=0;
       for(int i:area){
        ans+=i;
       }
       return ans;


        
    }
}