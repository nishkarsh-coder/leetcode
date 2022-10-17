class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] count=new int[26];
        
        for(int i=0;i<sentence.length();i++){
            char c=sentence.charAt(i);
            count[c-'a']++;
        }
        
        for(int i:count){
            if(i==0){
                return false;
            }
        }
        return true;
    }
}