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
    public TreeNode buildTree(int[] pre, int[] in) {
        return build(pre,in,0,pre.length-1,0,in.length-1);
    }
    
    TreeNode build(int[] pre,int[] in,int ps,int pe,int is,int ie ){
        if(ps>=pre.length||pe>=pre.length||is>=in.length||ie>=in.length){
            return null;
        }
        if(ps>pe||is>ie){
            return null;
        }
         if(ps<0||pe<0||is<0||ie<0){
            return null;
        }
        System.out.println(ps+" "+pe+" "+is+" "+ie);
        if(ps==pe){
            TreeNode root=new TreeNode(pre[ps]);
            return root;
        }
        int temp=pre[ps];
        TreeNode root=new TreeNode(temp);
        int i=is;
        for(;i<=ie;i++){
            if(in[i]==temp){
                break;
            }}
        int count= i-is;
                System.out.println(i);

        root.left=build(pre,in,ps+1,ps+count,is,i-1);
        root.right=build(pre,in,ps+count+1,pe,i+1,ie);
        return root;
    }
}