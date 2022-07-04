class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
        HashMap<Character,Integer> hm=new HashMap<>();
            for(int j=0;j<9;j++){
              // board
                char c= board[i][j];
                if(c=='.'){
                    continue;
                }
                    if(hm.containsKey(c)){
                        return false;
                    }
                hm.put(c,0);
            }
        }
        
        
        for(int i=0;i<9;i++){
        HashMap<Character,Integer> hm=new HashMap<>();
            for(int j=0;j<9;j++){
              // board
                char c= board[j][i];
                if(c=='.'){
                    continue;
                }
                    if(hm.containsKey(c)){
                        return false;
                    }
                hm.put(c,0);
            }
        }
        int col=0;
        int row=-3;
        for(int k=0;k<9;k++){        
        HashMap<Character,Integer> hm=new HashMap<>();
        if(k%3==0){
           col=0;   
            row+=3;
        } 
        for(int i=row;i<3+row;i++){
         for(int j=col;j<3+col;j++){
             char c= board[j][i];
                if(c=='.'){
                    continue;
                }
                    if(hm.containsKey(c)){
                        return false;
                    }
                hm.put(c,0);
        } 
        }
            col+=3;
            // row+=3;
                    }

        return true;
    }
}