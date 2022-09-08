class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ans=new ArrayList();
        // helper(graph,0,new ArrayList<>());
        bfs(graph);
        return ans;
    }
    // class pair{
    //     int n;
    //     ArrayList<Integer> arr;
    //     pair(int n,ArrayList<Integer> a){
    //         n=this.n;
    //         this.arr=a;
    //     }
    //     // pair(){
    //     //   this.arr=new ArrayList<>();  
    //     // }
    // }
    void bfs(int[][] graph){
        Queue<ArrayList<Integer>> q=new ArrayDeque<>();
                // Queue<Integer> q=new ArrayDeque<>();

        ArrayList<Integer> a=new ArrayList<>();
            a.add(0);
        q.add(a);
        // q.add(0);
        
        while(q.size()>0){
            ArrayList<Integer> top=q.remove();
           
            if(top.get(top.size()-1)==graph.length-1){
                ans.add(new ArrayList<>(top));
            }
            // System.out.println(q.size());
        
            for(int i :graph[top.get(top.size()-1)])
            {   //System.out.println(i);
                ArrayList<Integer>a1=new ArrayList<>(top);
                    a1.add(i);
                q.add(a1);
            // System.out.println("///"+q.peek().n+".."+q.peek().arr+" "+q.size());

            }      
           
                
            // System.out.println(q.peek().n+".."+q.peek().arr+" "+q.size());

        }
    }
    
    List<List<Integer>> ans;
    void helper(int[][] graph,int i,List<Integer> a){
        // System.out.println(i+": "+a+" ");
        a.add(i);
        if(graph.length==i+1){
            ans.add(new ArrayList<>(a));
            a.remove(a.size()-1);
            return;
        }
        int[] arr=graph[i];
        for(int j=0;j<arr.length;j++){
            int nbr=arr[j];
            helper(graph,nbr,a);
        }
        a.remove(a.size()-1);
        // System.out.println("back: "+i+" "+a);
    }
}