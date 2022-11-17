class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int[][] dp=new int[str1.length()+1][str2.length()+1];
        
        for(int i=1;i<=str1.length();i++){
            for(int j=1;j<=str2.length();j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
            // System.out.println(Arrays.toString(dp[i]));
        }
        
        StringBuilder ans =new StringBuilder();
        int i=str1.length();
        int j=str2.length();
        
        while(i!=0&&j!=0){
            // System.out.println(i+" "+j+" "+ans);
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                ans.append(str1.charAt(i-1));
                i--;
                j--;
            }else if(dp[i-1][j]>dp[i][j-1]){
                // System.out.println("eq"+" "+str1.charAt(i-1)+" "+str2.charAt(j-1));
                // System.out.println(dp[i-1][j]+" "+dp[i][j-1]);
                ans.append(str1.charAt(i-1));
                i=i-1;
            }else{
                ans.append(str2.charAt(j-1));
                j=j-1;
            }
            // System.out.println(i+" "+j+" "+ans+"...");
        }
                    // System.out.println(ans+"....."+i+" "+j+" ");
        
        while(i!=0){
            ans.append(str1.charAt(--i));
        }
        while(j!=0){
            ans.append(str2.charAt(--j));
        }

        return ans.reverse().toString();
        
    }
}