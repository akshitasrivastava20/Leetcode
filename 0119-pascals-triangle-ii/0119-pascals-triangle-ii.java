class Solution {
    public List<Integer> getRow(int rowIndex) {
       
        List<Integer> result =new ArrayList<>();
        if(rowIndex<0) return result;

       
        result.add(1);
        if(rowIndex==0) return result;

        for(int i=1;i<=rowIndex;i++){
            List<Integer> ans=new ArrayList<>();
            ans.add(1);
            //let suppose result is my prev and ans is my curr row
            for(int k=1;k<i;k++){
                ans.add(result.get(k-1)+result.get(k));
                
            }
            ans.add(1);
            result=ans;

        }
        return result;
    }
}