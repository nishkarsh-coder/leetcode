// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.nQueen(n);
            if(ans.size() == 0)
                System.out.println("-1");
            else {
                for(int i = 0;i < ans.size();i++){
                    System.out.print("[");
                    for(int j = 0;j < ans.get(i).size();j++)
                        System.out.print(ans.get(i).get(j) + " ");
                    System.out.print("] ");
                }
                System.out.println();
            }
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution{
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(n == 1){
            ArrayList<Integer> t = new ArrayList<>();
            t.add(1);
            ans.add(new ArrayList<>(t));
            return ans;
        }
        boolean[][] board = new boolean[n][n];
        int col = 0 , ldiag = 0 , rdiag = 0;
        solution(board , 0 , col , ldiag , rdiag, ans, new ArrayList<>());
        return ans;
    }
    
    private static void solution(boolean[][] b, int r,int col ,int ld ,int rd,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> t){
        if(r == b.length){
            ans.add(new ArrayList<>(t));
            return;
        }
        
        for(int c = 0; c < b.length;c++){
            if(
                ((col & (1 << c)) == 0) &&
                ((ld & (1 << r + c)) == 0) &&
                ((rd & (1 << r- c + b.length-1 )) == 0)){
                    b[r][c] = true;
                    col ^= (1<<c);
                    ld ^= (1<<(r+c));
                    rd ^= (1<<(r- c + b.length-1 ));
                    t.add(c+1);//add + 1 as one based indexing
                    solution(b , r + 1, col , ld , rd,ans , t);
                    t.remove(t.size()-1);
                    b[r][c] = false;
                    col ^= (1<<c);
                    ld ^= (1<<(r+c));
                    rd ^= (1<<(r- c + b.length-1 ));
                }
        }
    }
}