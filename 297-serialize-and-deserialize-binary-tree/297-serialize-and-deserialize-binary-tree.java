/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    class pair{
        TreeNode node;
        int state;
        pair(TreeNode node,int s){
            this.node=node;
            this.state=s;
        }
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Stack<pair> st=new Stack<>();
        st.add(new pair(root,0));
        StringBuilder str=new StringBuilder();
        while(st.size()>0){
            pair top=st.peek();
            if(top.state==0){
                if(top.node!=null){
                str.append(top.node.val+",");                    
                }else{
                    str.append(null+",");
                }
                top.state++;
                if(top.node!=null){
                st.push(new pair(top.node.left,0));                    
                }
            }else{
                st.pop();
                // str.append(top.node.val+",");
                top.state++;
                if(top.node!=null){
                st.push(new pair(top.node.right,0));  
                }
            }
        }  
    
            System.out.println(str);
            return str.toString();
}

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        
        StringBuilder str=new StringBuilder(data);
        if(str.charAt(0)=='n'){
                    // str.de/lete(0,5);
                    // top.node=null;
                    // st.pop();
            return null;
                }
        Stack<pair> st=new Stack<>();
        TreeNode root =new TreeNode();
        st.add(new pair(root,-1));
        while(st.size()>0){
           pair top=st.peek();
            if(top.state==-1){
                int idx=0;
                if(str.charAt(idx)=='n'){
                    str.delete(0,5);
                    top.node=null;
                    st.pop();
                }else if(str.charAt(0)=='-'){
                    int a=1;
                    while(str.charAt(a)!=','){
                        a++;
                    }
                    top.node.val=Integer.parseInt(str.substring(0,a));
                    str.delete(0,a+1);
                }else{
                    int a=1;
                    while(str.charAt(a)!=','){
                        a++;
                    }
                    top.node.val=Integer.parseInt(str.substring(0,a));
                    str.delete(0,a+1);
                }
                // if(top.node!=null)
                // System.out.println(top.node.val);
                top.state++;
            }else if(top.state==0){
                top.node.left=new TreeNode();
                if(str.charAt(0)=='n'){
                    str.delete(0,5);
                    top.node.left=null;
                    // st.pop();
                }else{
                st.push(new pair(top.node.left,-1));   
                }
                top.state++;
            }else{
                top.node.right=new TreeNode();
                st.pop();
                if(str.charAt(0)=='n'){
                    str.delete(0,5);
                    top.node.right=null;
                    // st.pop();
                }else{
                st.push(new pair(top.node.right,-1));   
                }
                top.state++;
            }
        }
        // System.out.println(str);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));