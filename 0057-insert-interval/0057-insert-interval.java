class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> lst=new ArrayList<>();
        int i=0;
        while(i<intervals.length && intervals[i][1]<newInterval[0]){
            lst.add(new int[]{intervals[i][0],intervals[i][1]});
            i++;

        }
        //check overlap btw i &further
        int s=newInterval[0];
        int e=newInterval[1];

        while(i<intervals.length&& intervals[i][0]<=e){
            s=Math.min(s,intervals[i][0]);
            e=Math.max(e,intervals[i][1]);
            i++;

        }
        lst.add(new int[]{s,e});
        while (i < intervals.length) {
            lst.add(intervals[i]);
            i++;
        }
        
        

        return lst.toArray(new int[lst.size()][2]);

        

    }
}