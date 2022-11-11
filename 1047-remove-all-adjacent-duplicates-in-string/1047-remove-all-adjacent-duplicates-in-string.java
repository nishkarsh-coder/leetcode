class Solution {
    public String removeDuplicates(String s) {
        char[] chars=s.toCharArray();
        
        if(s.length()==1){
            return s;
        }
        int n=s.length();
        StringBuilder ans=new StringBuilder();
        ans.append(s.charAt(0));
        for(int i=1;i<n;i++){
               if(ans.length()>0&&ans.charAt(ans.length()-1)==s.charAt(i)){
                   ans.deleteCharAt(ans.length()-1);
               }else{
                   ans.append(s.charAt(i));
               }
           
        }
        return ans.toString();
    }
}