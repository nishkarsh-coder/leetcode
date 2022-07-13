// { Driver Code Starts
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
            int N = Integer.parseInt(br.readLine().trim());
            String[] S1 = br.readLine().trim().split(" ");
            String[] S2 = br.readLine().trim().split(" ");
            int[] KnightPos = new int[2];
            int[] TargetPos = new int[2];
            for(int i = 0; i < 2; i++){
                KnightPos[i] = Integer.parseInt(S1[i]);
                TargetPos[i] = Integer.parseInt(S2[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minStepToReachTarget(KnightPos, TargetPos, N);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends


class Solution
{
    
    
    public class pair{
        int row;
        int col;
        int level;
        pair(int row,int col,int level){
        this.row=row;
        this.col=col;
        this.level=level; 
        }
    }
    //Function to find out minimum steps Knight needs to reach target position.
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        // Code here
        int[] dx = {2,2,-2,-2,1,-1,1,-1};
        int[] dy= {1,-1,1,-1,2,2,-2,-2};
        Queue<pair> q=new ArrayDeque<>();
        q.add(new pair(KnightPos[0],KnightPos[1],0));
        boolean[][] visited=new boolean[N][N];
        // System.out.println(q);
        while(q.size()>0){
            pair top=q.remove();
            // System.out.println("row: "+top.row+" col: "+top.col+" level: "+top.level+"  "+q.size());
            if(visited[top.row-1][top.col-1]==true){
                continue;
            }else if(top.row==TargetPos[0]&&top.col==TargetPos[1]){
                
                return top.level;
            }
            
            visited[top.row-1][top.col-1]=true;
            for(int i=0;i<8;i++){
                // System.out.println("f"+dx[i]+dy[i]);
                if(isvalid(top.row+dx[i],top.col+dy[i],N)&&visited[top.row+dx[i]-1][top.col+dy[i]-1]==false){
                    // System.out.println("hi");
                    q.add(new pair(top.row+dx[i],top.col+dy[i],top.level+1));
                }
            }    
        
        }
        return -1;
    }
    boolean isvalid(int row,int col,int N){
        if(row<=0||col<=0||row>N||col>N){
            // System.out.println("jio"+row+" "+col);
            return false;
        }
        return true;
    }
    
   
}