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
    public int diameterOfBinaryTree(TreeNode root) {
        diameter=0;
        
        sol(root);
        return diameter;
    }
    int diameter;
    
    int sol(TreeNode root){
        if(root==null){
            return -1;
        }
        int d1=sol(root.left);
        int d2=sol(root.right);
        
        if(diameter<d1+d2+2){
            diameter=d1+d2+2;
        }
        
        return d1>d2?d1+1:d2+1;
    }
}