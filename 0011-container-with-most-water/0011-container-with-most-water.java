class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int max=Integer.MIN_VALUE;
        int s=0;
        int e=height.length-1;
        while(s<e){
            area=(e-s)*Math.min(height[s],height[e]);
            max=Math.max(max,area);
            if(height[s]<=height[e]) s++;
            else e--;
        }
        return max;
    }
}