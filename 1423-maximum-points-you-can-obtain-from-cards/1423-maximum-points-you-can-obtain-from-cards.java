class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int windowSize=n-k;
        int i=0;
        int j=i+windowSize-1;
        int sum=0;
        int minsum=Integer.MAX_VALUE;
        int total=0;

        for(int p=i;p<j;p++){
            sum+=cardPoints[p];
        }
        for(int p=j+1;p<n;p++){
            total+=cardPoints[p];
        }
        total+=sum;
        minsum=sum;

        //reset
        i=0;
        j=windowSize;
        while(j<n){
           sum-=cardPoints[i];
           sum+=cardPoints[j];
           minsum=Math.min(minsum,sum);
           i++;j++;
            
        }

        return total-minsum;



    }
}