// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-->0){
            String s1[] = in.readLine().trim().split("\\s+");
            int mat[][] = new int[9][9];
            for(int i = 0;i < 81;i++)
                mat[i/9][i%9] = Integer.parseInt(s1[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.isValid(mat));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int isValid(int mat[][]){
        // code here
            HashSet<String> hm=new HashSet<>();
        for(int i=0;i<9;i++){
         for(int j=0;j<9;j++){
            int num= mat[i][j];
            if(num==0){
                continue;
            }
            String row="row"+num+j;
            String col="col"+num+i;
            String box="box"+num+(i/3)*3+(j/3);
            if(hm.contains(row)){
                // System.out.println(row);
                return 0;
            }else{
                hm.add(row);
            }
            if(hm.contains(col)){
                // System.out.println(col);
                return 0;
            }else{
                hm.add(col);
            }
            if(hm.contains(box)){
                // System.out.println(box);
                return 0;
            }else{
                hm.add(box);
            }
        }   
        }
        return 1;
    }
}