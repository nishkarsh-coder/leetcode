class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        char[] c= s.toCharArray();
        for(int i=0;i<s.length();i++){
           if(h.containsKey(s.charAt(i))==false){
            h.put(s.charAt(i),i);       
           }else{
               c[i]='0';
               c[h.get(s.charAt(i))]='0'    ;
           }
        }
        int i=0;
        for(char ch:c ){
            if(ch!='0'){
                return i; 
            }
            i++;
        }
        return -1;
    }
}