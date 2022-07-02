// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        // String ans="";
        int ans=0;
        char[] ch={'I','V','X','L','C','D','M'};
        int[] nums={1,5,10,50,100,500,1000};
        int i=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char c: ch){
            hm.put(c,nums[i++]);
            
        }
        i=0;
        // System.out.println(hm);
        while(i<str.length()){
            char c=str.charAt(i);
            int num1=hm.get(c);
            int num2=0;
            if(i<str.length()-1){
            char c1=str.charAt(i+1);
            num2=hm.get(c1);
            }
            if(num1>=num2){
                ans+=num1;
                i++;
            }else{
                ans+=num2-num1;
                i+=2;
            }
            // System.out.println(ans);
        }
        return ans;
        
    }
}