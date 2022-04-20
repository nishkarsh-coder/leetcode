// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class PhoneDigit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//testcases
        
        
        while(t-- > 0)
        {
            int n = sc.nextInt(); // input size of array
            int arr[] = new int[n]; //input the elements of array that are keys to be pressed
            
            for(int i = 0; i < n; i++)
               arr[i] = sc.nextInt();//input the elements of array that are keys to be pressed
            ArrayList <String> res = new Solution().possibleWords(arr, n);
            for (String i : res) System.out.print (i + " ");
             System.out.println();
              
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    {
        // your code here  
        
    String[] codes={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    
    if(N==0){
        ArrayList<String>list=new ArrayList<String>();
        list.add("");
        return list;
    }
    int num=a[a.length-N];
    ArrayList<String> list= possibleWords(a,N-1);
    String code=codes[num-1];
    ArrayList<String> ans =new ArrayList<String>();
   
        for(int i=0;i<code.length();i++){
             for(String val: list){
            ans.add(code.charAt(i)+val);
        }
        
    }
    return ans;
    }
}


