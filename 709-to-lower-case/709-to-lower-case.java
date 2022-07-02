class Solution {
    public String toLowerCase(String s) {
     
        // return s.toLowerCase();
        String ans="";
        for(int i=0;i<s.length();i++){
            int ascii=(int) s.charAt(i);
            if(ascii>64&&ascii<91){
                ans+=(char)(ascii+32);
            }else{
             ans+=s.charAt(i);   
            }
        }
        return ans;
    }
}