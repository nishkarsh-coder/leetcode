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
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null){
            List<String> arr=new ArrayList<String>();
            arr.add("");
            return arr;
        }
        if(root.left==null&&root.right==null){
            List<String> arr=new ArrayList<String>();
            arr.add(root.val+"");
            return arr;
        }
                List<String> ans=new ArrayList<String>();

        if(root.left!=null){
        List<String> l=binaryTreePaths(root.left);
             for(String a:l){
            ans.add(root.val+"->"+a);
        }
        }
        if(root.right!=null){
        List<String> r=binaryTreePaths(root.right); 
             for(String a:r){
            ans.add(root.val+"->"+a);
        }
        }
        
       
       
        return ans;
    }
}