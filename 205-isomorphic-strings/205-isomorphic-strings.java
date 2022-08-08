class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> hm1=new HashMap<>();
        HashMap<Character,Character> hm2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hm1.containsKey(s.charAt(i))&&hm1.get(s.charAt(i))!=t.charAt(i)){
               // System.out.println(i);
                return false;
            }else{
            hm1.put(s.charAt(i),t.charAt(i));                
            }
            if(hm2.containsKey(t.charAt(i))&&hm2.get(t.charAt(i))!=s.charAt(i)){
               // System.out.println(i);
                return false;
            }else{
            hm2.put(t.charAt(i),s.charAt(i));                
            }
        }
        return true;
    }
}