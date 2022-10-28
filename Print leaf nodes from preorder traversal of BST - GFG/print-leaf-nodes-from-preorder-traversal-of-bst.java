//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(read.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            Solution ob = new Solution();
            int[] ans = ob.leafNodes(arr, N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[] leafNodes(int arr[], int N)
    {
        // code here
        ArrayList<Integer> ans=new ArrayList<>(); 
        Stack<Integer> st=new Stack<>();
        st.push(arr[0]);
        for(int i=1;i<N;i++ ){
            int top=st.peek();
            int found=0;
            
            while(st.size()>0&&st.peek()<arr[i]){
                st.pop();
                found++;
            }
            
            if(found>=2){
                ans.add(top);
            }
            st.push(arr[i]);
        }
        ans.add(st.pop());
        int[] ans2=new int[ans.size()];
        int i=0;
        for(int num:ans){
            ans2[i++]=num;
        }
        return ans2;
    }
}