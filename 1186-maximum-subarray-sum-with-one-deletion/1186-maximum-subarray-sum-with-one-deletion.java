class Solution {
    public int maximumSum(int[] arr) {
        int prevnodel=arr[0];
        int prevwithdel=0;
        int max=arr[0];
        
        for(int i=1;i<arr.length;i++){
            prevwithdel=Math.max(prevwithdel+arr[i],prevnodel);
            prevnodel=Math.max(prevnodel+arr[i],arr[i]);
            
            int current=Math.max(prevnodel,prevwithdel);
            max=Math.max(current,max);
        }
        return max;
    }
}