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
        int with;
        int without;
        pair(){
            
        }
        pair(int with,int without){
            this.with=with;
            this.without=without;
        }
        
    }
    public int rob(TreeNode root) {
        // r=0;
        pair i=tell(root);
        return i.with>i.without?i.with:i.without;
    }
    // int r;
    pair tell(TreeNode root){
        if(root==null){
            return new pair(0,0);
        }
        pair lc=tell(root.left);
        pair rc=tell(root.right);
       
        pair my=new pair();
        
        my.with=lc.without+rc.without+root.val;
        my.without=Math.max(rc.with,rc.without)+Math.max(lc.without,lc.with);
        return my;
    }
}