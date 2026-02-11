class Solution {
    public String winningPlayer(int x, int y) {
        int count = 0;
        while (x > 0 && y >= 4) {
            count++;
            x--;
            y = y - 4;
        }
        if(count%2==0){
            return "Bob";
        }
        else{
            return "Alice";
        }

    }
}