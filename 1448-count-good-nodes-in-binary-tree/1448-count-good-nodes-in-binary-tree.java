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
    public int goodNodes(TreeNode root) {
        good=0;
        sol(root,Integer.MIN_VALUE);
        return good;
    }
    int good;
    void sol(TreeNode root,int max){
        if(root==null){
            return;
        }
        
        if(max>root.val){
            
        }else{
            good++;
            max=root.val;
        }
        
        sol(root.left,max);
        sol(root.right,max);
        
    }
}