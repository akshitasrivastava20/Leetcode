class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<9;i++){
            
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                if(!set.add(board[i][j])) return false;
            }
            set.clear();

        }

        for(int j=0;j<9;j++){
             
            for(int i=0;i<9;i++){
                if(board[i][j]=='.') continue;
                 if(!set.add(board[i][j])) return false;

            }
            set.clear();
        }

        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                int r=i+3;
                int s=j+3;
                for(int p=i;p<r;p++){
                    for(int q=j;q<s;q++){
                        if(board[p][q]=='.')continue;
                         if(!set.add(board[p][q])) return false;

                    }
                }

                set.clear();



            }
        }

        return true;
        
    }
}