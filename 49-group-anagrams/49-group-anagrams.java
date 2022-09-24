class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> ans=new ArrayList<List<String>>();
        
        HashMap<HashMap<Character,Integer>, List<String>> hm=new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            HashMap<Character,Integer> temp=new HashMap<>();
            String s=strs[i];
            int k=s.length();
            for(int j=0;j<k;j++){
                temp.put(s.charAt(j),temp.getOrDefault(s.charAt(j),0)+1);
            }
            if(hm.containsKey(temp)){
                hm.get(temp).add(s);
            }else{
                List<String> f=new ArrayList<>();
                f.add(s);
                hm.put(temp,f);
            }
        }
        
        
        for(HashMap<Character,Integer> i: hm.keySet()){
            ans.add(hm.get(i));
        }
        return ans;
        
        
    }
}