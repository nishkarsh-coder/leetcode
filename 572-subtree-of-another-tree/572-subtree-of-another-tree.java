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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        }
        // if(){
        if(root.val==subRoot.val){
            if(check(root,subRoot)){
                return true;
            }
        }
        if(isSubtree(root.left,subRoot)){
            return true;
        }
        if(isSubtree(root.right,subRoot)){
            return true;
        }            
        // }
            
        return false;
        
    }
    // boolean found=false;
    
    boolean check(TreeNode h1,TreeNode h2){
        if(h1==null&&h2==null){
            return true;
        }else if(h1==null){
            return false;
        }else if(h2==null){
            return false;
        }
        if(h1.val!=h2.val){
            return false;
        }
        if(check(h1.left,h2.left)==false)
            return false;
        if(check(h1.right,h2.right)==false)
            return false;
        
        return true;
    }
}