

class Trie {
    // TrieNode root;
    public Trie() {
    root=new TrieNode();       
    }
    private final TrieNode root;
       private class TrieNode{
         TrieNode[] arr=new TrieNode[26];
        boolean isend;
        }

    public void insert(String word) {
        // if(root==null){
        //     root=new TrieNode();
        // }
        TrieNode curr=root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(curr.arr[c-'a']==null){
                curr.arr[c-'a']=new TrieNode();
            }
            curr=curr.arr[c-'a'];
        }
        
        curr.isend=true;
    }
    
    public boolean search(String word) {
        TrieNode curr=root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(curr.arr[c-'a']==null){
                return false;
            }
            curr=curr.arr[c-'a'];
        }
        if(curr.isend==true){
        return true;            
        }
        return false;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr=root;
        for(int i=0;i<prefix.length();i++){
            char c=prefix.charAt(i);
            if(curr.arr[c-'a']==null){
                return false;
            }
            curr=curr.arr[c-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */