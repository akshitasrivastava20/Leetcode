class Solution {
    public boolean isValidSudoku(char[][] board) {
       HashSet<Character> s=new HashSet<>();
       HashSet<Character> p=new HashSet<>();

       
       for(int i=0;i<9;i++){
        int c1=0;int c2=0;
        for(int j=0;j<9;j++){
            if(board[i][j]!='.') 
            {
                s.add(board[i][j]);
                c1++;

             }
            if(board[j][i]!='.'){
                p.add(board[j][i]);
                c2++;

            } 
             
        }
        if(s.size()!=c1||p.size()!=c2) return false;
        s.clear();
        p.clear();

       }
       for(int row=0;row<9;row+=3){
        for(int col=0;col<9;col+=3){
            int c1=0;
            for(int i=row;i<row+3;i++){
                for(int j=col;j<col+3;j++){
                    if(board[i][j]!='.'){
                    s.add(board[i][j]);
                    c1++;}
                }
            }
            if(s.size()!=c1) return false;
            s.clear();

        }
       }
       return true;
       
    }
}