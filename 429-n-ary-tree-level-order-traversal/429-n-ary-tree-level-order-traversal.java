/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
//    class pair{
//        Node node;
//        int level;
//        pair(Node node,int  level){
//            this.node=node;
//            this.level=level;
//        }
       
//    }
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> q=new ArrayDeque<>();
        List<List<Integer>> ans= new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<Node> child=new ArrayDeque<>();
        
        q.add(root);
        ans.add(new ArrayList<Integer>());
        while(q.size()>0){
            Node top=q.remove();
            for(Node i:top.children){
                child.add(i);
            }
            ans.get(ans.size()-1).add(top.val);
            if(q.size()==0){
                q=child;
                child=new ArrayDeque<>();
                ans.add(new ArrayList<Integer>());
            }
            
        }
        // System.out.println(ans);
        ans.remove(ans.size()-1);
        return ans;
    }
}