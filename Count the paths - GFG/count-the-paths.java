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
            String[] S = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            int s = Integer.parseInt(S[2]);
            int d = Integer.parseInt(S[3]);
            int[][] edges = new int[m][2];
            for(int i = 0; i < m; i++){
                String[] S1 = br.readLine().trim().split(" ");
                edges[i][0] = Integer.parseInt(S1[0]);
                edges[i][1] = Integer.parseInt(S1[1]);
            }
            Solution obj = new Solution();
            int ans = obj.possible_paths(edges, n, s, d);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{   public class edge{
    int src;
    int nbr;
    edge(int src,int nbr){
        this.src=src;
        this.nbr=nbr;
    }
}
    public int possible_paths(int[][] edges, int n, int s, int d)
    {
        // Code here 
        ArrayList<edge>[] graph=new ArrayList[n];
        for(int i=0;i<n;i++){
        graph[i]=new ArrayList<edge>();
        }
        for(int i=0;i<edges.length;i++){
            int v1=edges[i][0];
            int v2=edges[i][1];
            graph[v1].add(new edge(v1,v2));
        }
    //  return 0;
    boolean[] visited=new boolean[n];
    return helper(graph,visited,s,d);
    } 
    
    static int helper(ArrayList<edge>[] graph, boolean[] visited,int s,int d){
        if(s==d){
            return 1;
        }
        visited[s]=true;
        int count=0;
        for(edge e: graph[s]){
            if(visited[e.nbr]==false){
                count+=helper(graph,visited,e.nbr,d);
            }
        }
        visited[s]=false;
        return count;
    }
}