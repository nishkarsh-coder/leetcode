//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends
class Solution{
    static String maxSum(String w,char x[],int b[], int n){
        //code here
        HashMap<Character,Integer> hm=new HashMap<>();
        
        for(int i=0;i<n;i++){
            hm.put(x[i],b[i]);
        }
        
        int[] arr=new int[w.length()];
        
        for(int i=0;i<w.length();i++){
            int val=0;
            char c=w.charAt(i);
            if(hm.containsKey(c)){
                val=hm.get(c);
            }else{
                val=(int)c;
            }
            arr[i]=val;
        }
        
        return kadane(arr,w);
    
    }
    
    static String kadane(int[] arr,String w){
        int start=0;
        int end=0;
        int curr=0;
        int max=0;
        int s=0;
        for(int i=0;i<arr.length;i++){
            curr+=arr[i];
            if(curr>max){
                max=curr;
                start=s;
                end=i;
            }
            
            if(curr<0){
                curr=0;
                s=i+1;
            }
        }
        
        return w.substring(start,end+1);
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String w = read.readLine();
            int n = Integer.parseInt(read.readLine());
            String TE[] = read.readLine().trim().split(" ");
            char x[] = new char[n];
            for(int i = 0;i<n;i++)
            {
                x[i] = TE[i].charAt(0);
            }
            
            String TR[] = read.readLine().trim().split(" ");
            int b[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                b[i] = Integer.parseInt(TR[i]);
            }
           
            Solution ob = new Solution();
            System.out.println(ob.maxSum(w,x,b,n));
        }
    }
}
// } Driver Code Ends