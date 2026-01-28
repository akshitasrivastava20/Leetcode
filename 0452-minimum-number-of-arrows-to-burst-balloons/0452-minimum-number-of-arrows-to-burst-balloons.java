class Solution {
    public int findMinArrowShots(int[][] points) {
        List<int[]> lst=new ArrayList<>();
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        int count=0;
        int s=points[0][0];
        int e=points[0][1];
        
        for(int i=1;i<points.length;i++){
            if(points[i][0]<=e){
                //overlap baloon can be popped
                s=Math.min(s,points[i][0]);
                e=Math.min(e,points[i][1]);

            }
            else{
                lst.add(new int[]{s,e});
                s=points[i][0];
                e=points[i][1];
            }
           
        
        }
         lst.add(new int[]{s,e});
        return lst.size();
    }
}