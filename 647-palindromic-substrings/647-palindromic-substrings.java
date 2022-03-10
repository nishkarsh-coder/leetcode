class Solution {
    
    public boolean palindrome(String str){
        boolean palin=true;
        for(int i=0;i<str.length()/2;i++){
        if(str.charAt(i)!=str.charAt(str.length()-1-i)){
        palin=false;
        break;
        }
        }
        return palin;
    }
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++ ){
        for(int j=i+1;j<=s.length();j++){
        if(palindrome(s.substring(i,j))){
            count++;
        }
        }
        }
        return count;
    }
}