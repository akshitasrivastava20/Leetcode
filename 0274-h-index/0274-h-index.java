class Solution {
    public int hIndex(int[] citations) {
        int h=1;int c=0;int h_max=0;
        
        while(h<=citations.length){
          for(int i:citations){
            if(i>=h)c++;
          }
          h_max=(c>=h)?Math.max(h_max,h):h_max;
          h++;c=0;

        }
        return h_max;
    }
}