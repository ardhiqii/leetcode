class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> grid1 = new HashSet<>();
        HashSet<Character> grid2 = new HashSet<>();
        HashSet<Character> grid3 = new HashSet<>();
        for(int i = 0; i < 9; i++){
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();
            if(i%3 == 0 && i> 0){
                grid1.clear();
                grid2.clear();
                grid3.clear();
            }
            for(int j = 0; j < 9; j++){
                char currRow = board[i][j];
                char currCol = board[j][i];
                if(currRow != '.'){
                    if(!row.add(currRow)) return false;
                    if(j <=2){
                        if(!grid1.add(currRow)) return false;
                    }else if(j<=5){
                        if(!grid2.add(currRow)) return false;
                    }else{
                        if(!grid3.add(currRow)) return false;
                    }
                }
                if(currCol != '.'){
                    if(!col.add(currCol)) return false;
                }

            }
            
        }
        return true;
    }
}