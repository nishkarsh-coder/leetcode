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
    TreeNode getright(TreeNode left,TreeNode curr){
        while(left.right!=null&&left.right!=curr){
            left=left.right;
        }
        return left;
    }
    public void recoverTree(TreeNode root) {
        TreeNode curr=root;
        TreeNode a=null;
        TreeNode b=null;    
        TreeNode prev=null;
        // ArrayList<TreeNode> arr=new ArrayList<>(); 
        while(curr!=null){
            TreeNode left=curr.left;
            if(left==null){
                // arr.add(curr);
                if(prev!=null&&prev.val>curr.val){
                    if(a==null){
                        a=prev;
                    }
                    b=curr;
                }
                prev=curr;
                curr=curr.right;   
            }else{
               TreeNode rightmost=getright(left,curr); 
                if(rightmost.right==null){
                    rightmost.right=curr;
                    curr=curr.left;
                }else{
                    rightmost.right=null;
                    // arr.add(curr);
                    if(prev.val>curr.val){
                        if(a==null){
                            a=prev;
                        }
                        b=curr;
                    }
                    prev=curr;
                    curr=curr.right;
                } 
            }
        }

        // for(int i=1;i<arr.size();i++){
        //     if(arr.get(i-1).val>arr.get(i).val){
        //         if(p1==null){
        //             p1=arr.get(i-1);
        //             p2=arr.get(i);
        //         }else{
        //             p2=arr.get(i);
        //             break;
        //         }
        //     }
        // }
        
        int temp=a.val;
        a.val=b.val;
    b.val=temp;
        // return 
    }
}