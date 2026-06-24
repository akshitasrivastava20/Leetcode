class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int satisfy=0;
        int childid=g.length-1;
        int cooid=s.length-1;
        while(cooid>=0&&childid>=0){
            if(g[childid]<=s[cooid]){
                satisfy++;
                childid--;
                cooid--;

            }
            else{
                childid--;
            }
        }
        return satisfy;







        
    }
}