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
       int level;
        pair(TreeNode node,int level){
            this.node=node;
            this.level=level;
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<pair> q=new ArrayDeque<>();
        q.add(new pair(root,0));
        while(q.size()>0){
            pair top=q.remove();
            if(ans.size()>top.level){
            ans.remove(top.level);                
            }
            ans.add(top.level,top.node.val);
            if(top.node.left!=null){
                q.add(new pair(top.node.left,top.level+1));
            }
            if(top.node.right!=null){
                q.add(new pair(top.node.right,top.level+1));
            }
        }
        return ans;
    }
}