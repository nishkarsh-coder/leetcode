// { Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[] a = new int[n], b = new int[m];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine[i]);
            }

            ArrayList<Integer> ans = new Solution().findSum(a, b);
            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java




class Solution {
    ArrayList<Integer> findSum(int a[], int b[]) {
        // code here
        
    ArrayList<Integer> ans= new ArrayList<Integer>();
    int i=a.length-1;
    int j=b.length-1;
    int k=0;
    if(i<j){
        k=j;
    }
    else{
        k=i;
    }
    int c=0;
    while(k>=0){
        int d=c;
        if(i>=0){
        d+=a[i];
        }
        if(j>=0){
        d+=b[j];
        }
        c=d/10;
        d=d%10;
        ans.add(d);
        k--;
        i--;
        j--;
    }
    if(c!=0){
        ans.add(c);
    }
    ArrayList<Integer> revans= new ArrayList<Integer>();
    
    for(int n=ans.size()-1;n>=0;n--)
    {
        revans.add(ans.get(n));
    }
    
    
    return revans;
    }
}