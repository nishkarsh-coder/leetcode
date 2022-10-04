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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root,0,targetSum);    
    }
    
    
    boolean helper(TreeNode node,int sum,int target){
        if(node==null){
            return false;
        }
        // System.out.println();
        sum=sum+node.val;
        if(node.left==null&&node.right==null&&sum==target){
            return true;
        }
        if(helper(node.left,sum,target)){
            return true;
        }
        if(helper(node.right,sum,target)){
            return true;
        }
        
        return false;
    }
    
}