class Solution {
    class edge{
        int src;
        int nbr;
        edge(int s,int n){
            this.src=s;
            this.nbr=n;
        }
    }
    
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] visited=new boolean[n];
        ArrayList<edge>[] graph=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<edge>();
        }
        for(int i=0;i<edges.length;i++){
            int src=edges[i][0];
            int nbr=edges[i][1];

            graph[src].add(new edge(src,nbr));
            graph[nbr].add(new edge(nbr,src));   
                
        }
       return helper(graph,source,destination,visited);
    }
    
    boolean helper(ArrayList<edge>[] graph,int s,int d,boolean visited[]){
        if(visited[s]==true){
            return false;
        }
        if(s==d){
            return true;
        }
        visited[s]=true;
        
        for(edge i: graph[s]){
           if(visited[i.nbr]==false){
               if(helper(graph,i.nbr,d,visited)){
                   return true;
               }
           }
        }
        
        
        // visited[s]=false;
        
        return false;
    }
}