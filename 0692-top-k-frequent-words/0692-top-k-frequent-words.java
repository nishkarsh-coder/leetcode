import java.util.Map.*;
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ans=new ArrayList<>();
        
       TreeMap<String,Integer>  hm=new TreeMap<>(); 
        for(int i=0;i<words.length;i++){
            hm.put(words[i],hm.getOrDefault(words[i],0)+1);
        }
        Set<Entry<String,Integer>> entries= hm.entrySet();
        
        ArrayList<Entry<String,Integer>> arr=new ArrayList<>(entries);
        
        Collections.sort(arr,new Comparator<Entry<String,Integer>>(){
            
           public int compare(Entry<String,Integer> me,Entry<String,Integer> other){
                if(other.getValue()!=me.getValue())
                {
                    return other.getValue()-me.getValue();
                }else{
                    return me.getKey().compareTo(other.getKey());
                }   
            }
        });
             
        // int k=0;
        for(Entry<String,Integer> e:arr){
            if(k==0){
                break;
            }
            k--;
            ans.add(e.getKey());
        }
        
        return ans;
    }
}