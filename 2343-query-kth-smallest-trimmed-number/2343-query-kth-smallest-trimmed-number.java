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
     
      return this.num.compareTo(other.num);
 
        }
        
     
        
    }
    
    int countsort(String[] nums,int k,int trim){
        
        // HashMap<Integer,List<pair>> hm=new HashMap<>();
        // List<pair> ans=new ArrayList<>();
        pair[] ans=new pair[nums.length];
        for(int i=0;i<nums.length;i++){
            String str=nums[i];
            int l=str.length();
            // ans.add(new pair(str.substring(str.length()-trim),i));
            ans[i]=new pair(str.substring(str.length()-trim),i);
        }
        
       // Collections.sort(ans);
        Arrays.sort(ans);
        return ans[k-1].pos;
        
        // return ans.get(k-1).pos;
    }
}