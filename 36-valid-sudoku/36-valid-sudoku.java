class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<String,Integer> hm=new HashMap<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++)
            {   char c= board[i][j];
             if(c=='.'){
                 continue;
             }
                String row="row"+c+i;
                int n=(j/3)+(i/3)*3;
                String box="box"+c+n;
                String col="col"+c+j;
             
                if(hm.containsKey(row)){
                    return false;
                }else{
                    hm.put(row,0);
                }
             if(hm.containsKey(col)){
                    return false;
                }else{
                    hm.put(col,0);
                }
             if(hm.containsKey(box)){
                    return false;
                }else{
                    hm.put(box,0);
                }
            }
        }
        return true;
    }
}