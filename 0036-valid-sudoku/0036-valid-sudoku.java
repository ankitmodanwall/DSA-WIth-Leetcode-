class Solution {
    public boolean isValidSudoku(char[][] board) {
        

        HashSet<String> set= new HashSet<>();
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                if(board[i][j] =='-')
                continue;
            }
            if(!set.add(board[i][j] + "in row" + i)){
                return false;
            }
            if(!set.add(board[i][j] + "in col" + j)){ 
            return false;
        }
        if (!set.add(board[i][j] + "in row" + "in col"+ i/3 + j/3)){
   return false;
    }
    }
   return true;
}}