class Solution {
    public String breakPalindrome(String palindrome) {
        StringBuilder ans=new StringBuilder();
        if(palindrome.length()==1){
            return "";
        }
        boolean found=false;
        int i=0;
        for(;i<palindrome.length()/2;i++){
            char c=palindrome.charAt(i);
            // ans.append(c);
            if(c!='a'&&found==false){
                found=true;
                ans.append('a');
            }else{
                ans.append(c);
            }
            // System.out.println(ans);
        }
        if(found==true){
            while(i<palindrome.length()){
                ans.append(palindrome.charAt(i));
                i++;
            }
        return ans.toString();
        }
        
            return palindrome.substring(0,palindrome.length()-1)+'b';
        
        // ans.insert(ans.length()-1,ans.length(),'b')
    }
}