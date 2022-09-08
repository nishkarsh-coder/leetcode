class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1){
            return -1;
        }
        // int[][] graph=new int[][n];
        ArrayList<ArrayList<Integer>> graph=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] arr:connections){
            int s=arr[0];
            int nb=arr[1];
            graph.get(s).add(nb);
                        graph.get(nb).add(s);

        }
        int count=0;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
        if(visited[i]==false){
            System.out.println(i);
            help(graph,i,visited);
            count++;
        }
        }
        return count-1;
    }
    
    void help(ArrayList<ArrayList<Integer>> graph,int s,boolean[] visited){
        if(visited[s]==true){
            return;
        }
        visited[s]=true;
        
        for(int i: graph.get(s)){
            if(visited[i]==false){
                help(graph,i,visited);
            }
        }
        
        
    }
}