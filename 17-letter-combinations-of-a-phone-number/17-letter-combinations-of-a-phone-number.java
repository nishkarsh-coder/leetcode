import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
      if(digits.length()==0){
          // System.out.println("length0"+digits);

          return new ArrayList<String>();
      }
        else{
        // System.out.println("length01hi"+digits);
         return letter(digits);
        }
        
    } 
    public List<String> letter(String digits) {
      String[] codes={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits.length()==0){
        List<String> l=new ArrayList<String>();
        l.add("");
        return l;
        }        
        String code= codes[digits.charAt(0)-49];

         
       List<String> l=letter(digits.substring(1));
     List<String> ans=new ArrayList<String>();

       
        
        for(String val: l){
        for(int i=0;i<code.length();i++){
            ans.add(code.charAt(i)+val);
        }
        }
        return ans;  
    }
    
}