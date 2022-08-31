/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> arr1=path(root,p);
        ArrayList<TreeNode> arr2=path(root,q);
        int n=arr1.size();
        if(arr1.size()>arr2.size()){
            n=arr2.size();
        }
        int i=0;
        for(;i<n;i++){
          if(arr1.get(i).val==arr2.get(i).val){
              continue;
          }else{
              break;
          }  
        }
      
        
        return arr1.get(i-1);
    }
    
    ArrayList<TreeNode> path(TreeNode root,TreeNode p){
        if(root==null){
            return new ArrayList<TreeNode>();
        }
        ArrayList<TreeNode> l= path(root.left,p);
        if(root==p){
           ArrayList<TreeNode> ans= new ArrayList<TreeNode>();
           ans.add(p);
            return ans;
        }
        if(l.size()>0){
            l.add(0,root);
            return l;
        }
        ArrayList<TreeNode> r=path(root.right,p);
        if(r.size()>0){
            r.add(0,root);
            return r;
        }
        
        return new ArrayList<TreeNode>();
    }
    
}