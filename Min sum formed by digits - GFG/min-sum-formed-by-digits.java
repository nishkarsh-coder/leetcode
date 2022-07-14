// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.minSum(a, n));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public static long minSum(int arr[], int n)
    {
        // Your code goes here
        Arrays.sort(arr);
        int pow1=0;
        int pow2=0;
        long num1=0;
        long num2=0;
        for(int i=n-1;i>=0;i--){
            if(i%2==0){
            num1+=(long)Math.pow(10,pow1)*arr[i];
            pow1++;
            }else{
            num2+=(long)Math.pow(10,pow2)*arr[i];
            pow2++;
            }
        // System.out.println(num1+" "+num2);
        }
        // System.out.println(num1+" "+num2);
        return (long)num1+num2;
    }
}