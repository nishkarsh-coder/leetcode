// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] str = br.readLine().trim().split(" ");
            int N = Integer.parseInt(str[0]);
            int M = Integer.parseInt(str[1]);
            int[][] matrix = new int[N][M];
            for(int i=0; i<N; i++)
            {
                String[] s = br.readLine().trim().split(" ");
                for(int j=0; j<M; j++)
                    matrix[i][j] = Integer.parseInt(s[j]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.closedIslands(matrix, N, M));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int closedIslands(int[][] matrix, int N, int M)
    {
        // Code here
        int count=0;
        boolean[][]visited=new boolean[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(visited[i][j]==false&&matrix[i][j]==1){
                if(helper(matrix,visited,i,j)){
                //   System.out.println(i+" "+j);
                    count++;
                }
                }
            }
        }
        return count;
    }
    
    boolean helper(int[][] matrix,boolean[][] visited,int row,int col){
        if(row<0||col<0||row>=matrix.length||col>=matrix[0].length){
            return false;
        }
        if(visited[row][col]==true||matrix[row][col]==0){
            return true;
        }
        boolean ans=true;
        visited[row][col]=true;
        if(helper(matrix,visited,row+1,col)==false){
            ans=false;
        }
        if(helper(matrix,visited,row-1,col)==false){
            ans=false;
        }
        if(helper(matrix,visited,row,col+1)==false){
            ans=false;
        }
        if(helper(matrix,visited,row,col-1)==false){
            ans=false;
        }
        // helper(matrix,visited,row-1,col);
        // helper(matrix,visited,row,col+1);
        // helper(matrix,visited,row,col-1);
        return  ans;
    }
}