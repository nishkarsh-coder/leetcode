class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder str=new StringBuilder();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<title.length();i++){
            char c=title.charAt(i);
            if(c==' '){
                if(str.length()>2){
                    ans.append(capitalize(str.toString())+" ");                   
                }
                else{
                    ans.append(str.toString().toLowerCase()+" ");
                }
                str=new StringBuilder();
            }else{
            str.append(c);
            }
        }
           if(str.length()>2){
                    ans.append(capitalize(str.toString()));                   
                }
                else{
                    ans.append(str.toString().toLowerCase());
                }
        return ans.toString();
    }
    
     public String capitalize(String title) {
        title=title.toLowerCase();
        char c=title.charAt(0);
         c=(char)(c-32);
         
        title=c+title.substring(1);
         return title;
    }
    
}