class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> h1=new HashMap<Character,Integer>();
        
        for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            h1.put(c,h1.getOrDefault(c,0)+1);
        }
        
        HashMap<Character,Integer> h2=new HashMap<Character,Integer>();
        
        for(int i=0;i<magazine.length();i++){
            char c=magazine.charAt(i);
            h2.put(c,h2.getOrDefault(c,0)+1);
        }
        
        for(char c: h1.keySet()){
            if(h2.get(c)==null||h1.get(c)>h2.get(c)){
                return false;
            }
        }
        return true;
    }
}