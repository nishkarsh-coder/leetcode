class Solution {
    public List<Integer> lexicalOrder(int n) {
        
        ans=new ArrayList<>();
        for(int i=1;i<=9;i++){
        helper(i,n);            
        }
        return ans;
    }
      List<Integer> ans;
    
   void helper(int ind,int n){
       if(ind>n){
           return;
       }
       ans.add(ind);
      for(int j=0;j<10;j++){
          helper(10*ind+j,n);
      } 
       
       
        
        
    }
}