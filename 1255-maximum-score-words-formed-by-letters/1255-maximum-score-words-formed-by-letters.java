class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        // HashMap<Character,Integer> hm=new HashMap<>();
        
         
        max=0;
        int[] len=new int[26];
        
        for(char c: letters){
            len[c-'a']+=1;
        }
        helper(0,score,words,0,len);
        
        return max;
    }
    int max;
    
   void helper(int curr,int[] score,String[] words,int pos,int[] len){
        if(pos==words.length){
            if(max<curr){
                max=curr;
            }
            return;
        }
        
       helper(curr,score,words,pos+1,len);
        
        char[] str=words[pos].toCharArray();
       boolean found=true;
       for(char c:str){
           curr+=score[c-'a'];
           if(len[c-'a']==0){
               found=false;
                len[c-'a']-=1;
           }else{
               len[c-'a']-=1;
           }    
       }
       
       if(found){
           helper(curr,score,words,pos+1,len);
       }
        
        for(char c:str){
           // curr+=score[c-'a'];
               len[c-'a']+=1;
             
       }
        
        
        
        return;
    }
}