class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ans=new ArrayList();
        helper(graph,0,new ArrayList<>());
        return ans;
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