class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;
        ArrayList<ArrayList<Character>> grid=new ArrayList<>();
        for(int j=0;j<numRows;j++){
               grid.add(new ArrayList<>());
        }
       int i=0;
       int d=1;
        
       for(char ch:s.toCharArray()){
          grid.get(i).add(ch);
          if(i==0) d=1;
           if(i==numRows-1)d=-1;
           i+=d;
       } 
       StringBuilder sb=new StringBuilder();
       for(ArrayList<Character> row:grid){
        for(char ch:row){
            sb.append(ch);
        }
       }
       return sb.toString();
    }
}