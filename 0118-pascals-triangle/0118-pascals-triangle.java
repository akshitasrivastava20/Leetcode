class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();

    if(numRows==0) return ans;

    List<Integer> firstRow=new ArrayList<>();
    firstRow.add(1);
    ans.add(firstRow);

    if(numRows==1) return ans;

    for(int i=1;i<numRows;i++){
        List<Integer> curr=new ArrayList<>();
        curr.add(1);
        List<Integer> prev=ans.get(i-1);
        for(int k=1;k<i;k++){
            curr.add(prev.get(k-1)+prev.get(k));
        }
        curr.add(1);
        ans.add(curr);
    }
    return ans;

    }
}