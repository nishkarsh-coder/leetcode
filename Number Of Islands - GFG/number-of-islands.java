//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution {
    
    public List<Integer> numOfIslands(int rows, int cols, int[][] operators) {
        //Your code here
        int[][] helper=new int[rows][cols];
        List<Integer> ans=new ArrayList<Integer>();
        for(int k=0;k<operators.length;k++){
        int count=0;
            int r=operators[k][0];
            int c=operators[k][1];
            helper[r][c]=1;
        boolean [][] visited=new boolean[rows][cols];
        for(int i=0;i<helper.length;i++){
            for(int j=0;j<helper[0].length;j++){
                if(visited[i][j]==false&&helper[i][j]==1){
                   dfs(helper,i,j,visited);
                   count++; 
                }
            }
        }
        ans.add(count);
        }
        
        return ans;
    }
    
    void dfs(int[][] helper,int row,int col,boolean[][] visited){
        if(row<0||col<0||col>=helper[0].length||row>=helper.length||helper[row][col]==0||visited[row][col]==true){
            return;
        }
        
        
        visited[row][col]=true;
        
        dfs(helper,row+1,col,visited);
        dfs(helper,row,col-1,visited);
        dfs(helper,row-1,col,visited);
        dfs(helper,row,col+1,visited);
    }
    
    
    
}

//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int  k= sc.nextInt();
            int[][] a = new int[k][2];
            for(int i=0;i<k;i++){
            
                a[i][0] = sc.nextInt();
                a[i][1] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            List<Integer> ans = obj.numOfIslands(n,m,a);
           
            for(int i:ans){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends