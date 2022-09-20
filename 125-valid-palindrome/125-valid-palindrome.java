class Solution {
    public boolean isPalindrome(String s) {
         s=convert(s);
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
   public String convert(String str){
       String ans="";
       str=str.toLowerCase();
       for(int i=0;i<str.length();i++){
           char c=str.charAt(i);
           if(c>=97&c<=122){
           ans+=c;               
           }else if(c>='0'&&c<='9'){
               ans+=c;
           }
        }
       return ans;
    }
}