class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans=new int[2];
        int n=grid.length;
        HashMap<Integer,Integer> mp=new HashMap<>(); 
        for(int[] row:grid){
            for(int ele:row){
                mp.put(ele,mp.getOrDefault(ele,0)+1);

                

            }
        }
        int sum=0;
        for(int i:mp.keySet()){
            if(mp.get(i)==2) ans[0]=i;
            sum+=i;

        }
        
        int total=n*n;
        ans[1]=total*(total+1)/2-sum;
        return ans;


    }
}