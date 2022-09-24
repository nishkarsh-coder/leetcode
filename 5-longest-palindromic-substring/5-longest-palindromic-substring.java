class Solution {
    public String longestPalindrome(String s) {
      int start=0;
      int max=1;
        
        for(int i=0;i<s.length();i++){
            int r=i+1;
            int l=i-1;
            while(r<s.length()&&l>=0&&s.charAt(r)==s.charAt(l)){
                if(r-l+1>max){
                    start=l;
                    max=r-l+1;
                }
                r=r+1;
                l=l-1;
            }
            
            r=i+1;
            l=i;
            while(r<s.length()&&l>=0&&s.charAt(r)==s.charAt(l)){
                if(r-l+1>max){
                    start=l;
                    max=r-l+1;
                }
                r=r+1;
                l=l-1;
            }
        }
        
        
        
        
        return s.substring(start,start+max);
        
    }
}