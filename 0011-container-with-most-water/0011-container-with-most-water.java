class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int area=0;
        int max_area=0;

       while(i<j){
         if(height[i]-height[j]>=0){
            area=height[j]*(j-i);
        }
        else{
            area=height[i]*(j-i);

        }
        if(area>max_area) max_area=area;
         if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
       }
       return max_area;
    }
}