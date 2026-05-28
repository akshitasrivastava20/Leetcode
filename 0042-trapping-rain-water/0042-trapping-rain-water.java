class Solution {
    public int trap(int[] height) {
        int[] l=new int[height.length];
        int[] r=new int[height.length];
        int area=0;

        int lmax=height[0];
        l[0]=0;
        for(int i=1;i<height.length;i++){
            l[i]=lmax;
            lmax=Math.max(lmax,height[i]);
        }
        r[height.length-1]=0;
        int rmax=height[height.length-1];
         for(int i=height.length-2;i>=0;i--){
            r[i]=rmax;
            rmax=Math.max(rmax,height[i]);
        }
        for(int i=0;i<height.length;i++){
            if(height[i]<=Math.min(l[i],r[i])) area+=Math.min(l[i],r[i])-height[i];

        }
        return area;
        
    }
}