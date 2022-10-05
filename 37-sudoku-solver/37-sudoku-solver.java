class Solution {
    public void solveSudoku(char[][] board) {
         helper(board,0,0);
    }
    
    boolean helper(char[][] board,int row, int col){
           
        if(row==board.length){
            // System.out.println("??");
            return true;
        }
        // System.out.println(row+" "+col+" "+board[row][col]);
        if(row<0||col<0||row>=board.length||col>=board[0].length){
            // System.out.println("??");
            return false;
        }
     
        
        
        int newcol=col+1;
        int newrow=row;
            if(newcol==9){
            newrow=row+1;
               newcol=0; 
        }
        if(board[row][col]!='.'){
           return helper(board,newrow,newcol);
        }else{
            // if(row==1&&col==8){
            //     System.out.println("??");
            // }
        for(int i=1;i<=9;i++){
            
            if(isvalid(board,row,col,i)){
              
            board[row][col]=Character.forDigit(i,10);
                // System.out.println(board[row][col]);
                if(helper(board,newrow,newcol)){
                                // System.out.println("??");

                return true;
            }                
            }
        }
            board[row][col]='.';
        }
        
                    // System.out.println("??");

        return false;
    }
    
    boolean isvalid(char[][] board,int row,int col,int num){
        // if(num==9){
        // System.out.println(row+" "+col+" "+num);            
        // }
        for(int i=0;i<board.length;i++){
            // if(num==9){
            // System.out.println(row+" "+col+" "+num+" "+board[row][i]+".....");            
            // }
            if(board[row][i]-'0'==num){
                return false;
            }
        }
        for(int i=0;i<board[0].length;i++){
            if(board[i][col]-'0'==num){
                return false;
            }
        }
        
        for(int i=row-row%3;i<row-row%3+3;i++){
            for(int j=col-col%3;j<col-col%3+3;j++){
            if(board[i][j]-'0'==num){
                return false;
            }         
            }
        }
        
        return true;
    }
    
}