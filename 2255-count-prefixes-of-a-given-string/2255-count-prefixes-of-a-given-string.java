class Solution {
    public int countPrefixes(String[] words, String s) {
        int n=words.length;
        int ans=0;
        for(int i=0;i<n;i++){
        int l=words[i].length();
        if(s.length()>=l){
            // System.out.println(s.substring(0,l)+" "+words[i]);
            if(s.substring(0,l).equals(words[i])){
            ans++;
            }
        }    
        }
        return ans ;
    }
}