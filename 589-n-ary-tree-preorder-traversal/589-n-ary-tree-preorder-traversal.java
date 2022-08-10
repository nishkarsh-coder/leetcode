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
    public List<Integer> preorder(Node root) {
        List<Integer> ans=new ArrayList();  
        if(root==null){
            return ans;
        }
        Stack<Node> st=new Stack<>();
        st.push(root);
        while(st.size()>0){
            Node top=st.pop();
            ans.add(top.val);
            for(int i=top.children.size()-1;i>=0;i--){
                st.push(top.children.get(i));      
            }
        }
        return ans;
    }
}