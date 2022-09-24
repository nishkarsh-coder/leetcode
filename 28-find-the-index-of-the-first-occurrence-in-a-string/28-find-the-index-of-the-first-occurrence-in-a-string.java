class Solution {
    public int strStr(String haystack, String needle) {
        ArrayList<Integer> arr=new ArrayList<>();
        // ArrayList
        for(int i=0;i<haystack.length();i++){
           char c=haystack.charAt(i);
            if(c==needle.charAt(0)) arr.add(i);
        }
        for(int i:arr){
            if(i+needle.length()<=haystack.length()&&needle.equals(haystack.substring(i,i+needle.length()))) return i;
        }
        
return -1;
    }
}