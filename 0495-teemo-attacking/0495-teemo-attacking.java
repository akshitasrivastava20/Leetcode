class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int poisoned=0;
         
        for(int i=0;i<timeSeries.length-1;i++){
           poisoned+=Math.min(duration,timeSeries[i+1]-timeSeries[i]);


        }
        return poisoned+duration;
        
    }
}