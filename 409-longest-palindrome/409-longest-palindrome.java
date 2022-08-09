class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1){
            return 1;
        }
        HashMap<Character,Integer> hm=new HashMap<>();
        // int ans=1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
//             if(hm.contains){
                
//             }
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int even=0;
        int odd=0;
        int size=0;
        boolean found=false;
        for(char c: hm.keySet()){
            int i=hm.get(c);      
        if(i%2==0){
            size+=i;
            // even++;
        }else{
            found=true;
                size+=i-1;
        }
        }
        System.out.println(hm);
        if(found){
       return size+1;            
        }else
        {
       return size;
            
        }
        
    }
}