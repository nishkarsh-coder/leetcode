/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     class pair{
        TreeNode node;
        int state;
        pair(TreeNode min,int max){
            this.node=min;
            this.state=max;
        }
    }
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        Stack<pair> st=new Stack<>();
        st.add(new pair(root,0));
        while(st.size()>0){
            pair top=st.peek();
            if(top.state==0){
                if(top.node.left!=null){
                st.push(new pair(top.node.left,0));                    
                }
                top.state++;
            }else if(top.state==1){
                st.pop(); 
                arr.add(top.node.val);
                if(top.node.right!=null){
                // st.push(top.node.left);                    
                st.push(new pair(top.node.right,0));
                }
                top.state++;
            }
        }
        for(int i=1;i<arr.size();i++){
            System.out.println(arr.get(i));
            if(arr.get(i)<=arr.get(i-1)){
                return false;
            }
        }
        
        return true;
    }
}