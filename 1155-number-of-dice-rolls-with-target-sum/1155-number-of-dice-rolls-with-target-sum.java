class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        HashMap<String,Integer> hm=new HashMap<>();
        return helper(n,k,target,hm);
    }
    
   int helper(int n,int k,int target,HashMap<String,Integer> hm){
       if(k*n<target){
           return 0;
       } 
       if(n!=0&&target==0){
            return 0;
        }else if(target<0){
            return 0;
        }else if(n==0&&target==0){
            return 1;
        }
       int count=0;
       String key=""+n+k+target;
       if(hm.containsKey(key)){
           return hm.get(key);
       }
       for(int i=1;i<=k;i++){
           count+=helper(n-1,k,target-i,hm);
            count=count%(1000000007);
       }
       hm.put(key,count);
       return count%(1000000007);
    }
}