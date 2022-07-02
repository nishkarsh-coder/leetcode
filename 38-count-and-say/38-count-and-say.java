class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
    
        String ans1 =countAndSay(n-1);
          // ans = new StringBuilder();
        char []c= ans1.toCharArray();
        if(c.length==1){
            return ans1+1;
        }
        int count=1;
       StringBuilder ans=new StringBuilder();
        for(int i=0;i<c.length-1;i++){
            if(c[i]==c[i+1]){
                count++;
            }else{
              ans.append(count);
             ans.append(c[i]);
            count=1;
            }
        }
        // System.out.println(count+c[c.length-1]);
        ans.append(count);
        ans.append(c[c.length-1]);
                // System.out.println(ans);
       return ans.toString();
    }
}