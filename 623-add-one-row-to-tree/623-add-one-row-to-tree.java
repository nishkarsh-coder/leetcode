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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth-1==0){
            TreeNode n1=new TreeNode(val);
            n1.left=root;
            return n1;
        }
        return helper(root,val,depth,1);
    }
    
    TreeNode helper(TreeNode root,int val,int depth,int d){
        
        if(root==null){
            return root;       
        }
        
        if(depth-1==d){
            TreeNode n1=new TreeNode(val);
            TreeNode n2=new TreeNode(val);
            n1.left=root.left;
            n2.right=root.right;
            root.left=n1;
            root.right=n2;
        }else{
            
            root.right=helper(root.right,val,depth,d+1);            
            root.left=helper(root.left,val,depth,d+1);  
        }
        return root;
    }
    
}