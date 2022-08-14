class Solution {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int q=queries.length;
        int[] ans=new int[q];
        for(int i=0;i<q;i++){
            int k=queries[i][0];
            int trim=queries[i][1];
            
            ans[i]=countsort(nums,k,trim);
            
        }
        return ans;
    }
    class pair implements Comparable<pair>{
        String num;
        int pos;
        pair(String num,int pos){
            this.num=num;
             this.pos=pos;
        }
        
        public int compareTo(pair other){
             if (this.num.compareTo(other.num) == 0) {
      return this.pos-other.pos;
    } else {
      return this.num.compareTo(other.num);
    }
        }
        
     
        
    }
    
    int countsort(String[] nums,int k,int trim){
        
        // HashMap<Integer,List<pair>> hm=new HashMap<>();
        List<pair> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String str=nums[i];
            int l=str.length();
            ans.add(new pair(str.substring(str.length()-trim),i));
        }
        
       Collections.sort(ans);
        
        
        return ans.get(k-1).pos;
    }
}