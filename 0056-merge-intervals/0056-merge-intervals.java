class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> lst=new ArrayList<>();
        int s=intervals[0][0];
        int e=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=e){
                //overlap
                e=Math.max(e,intervals[i][1]);
            }
            else{
                lst.add(new int[]{s,e});
                s=intervals[i][0];
                e=intervals[i][1];
            }
        }
        lst.add(new int[]{s,e});

       return lst.toArray(new int[lst.size()][2]);
    }
}