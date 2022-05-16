// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}



// } Driver Code Ends


class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        // your code here
        
        // System.out.println(n);
        long[] r=new long[(int)n];
        
    //   ArrayList<Integer> r = new ArrayList<Integer>(n);
        Stack<Integer> st=new Stack<Integer>();
        r[(int)n-1]=n;
        st.push((int)n-1);
        // System.out.println(st.peek());
        for(int i=(int)n-2;i>=0;i--){
            while(st.size()!=0&&hist[i]<=hist[st.peek()]){
                st.pop();
            }
            
            if(st.size()==0){
                r[i]=n;
            }
            else{
                r[i]=st.peek();
            }
            st.push(i);
        }
        
        
        long[] l=new long[(int)n];
        // ArrayList<Integer> x = new ArrayList<Integer>(n);
        Stack<Integer> stl=new Stack<Integer>();
        l[0]=-1;
        stl.push(0);
        for(int i=1;i<n;i++){
            while(stl.size()!=0&&hist[i]<=hist[stl.peek()]){
                stl.pop();
                // System.out.println("pop"+stl.size());
            }
            if(stl.size()==0){
                l[i]=-1;
            }
            else{
                l[i]=stl.peek();
            }
            stl.push(i);
        }
        
        // for(int i=0;i<n;i++){
        //     System.out.println("r"+l[i]);
        //     // System.out.println("l"+l[i]);
            
        // }
        
        long maxarea=0;
        for(int i=0;i<n;i++){
            long length=hist[i];
          long width= r[i]-l[i]-1;
            
            if(maxarea<length*width){
                maxarea=length*width;
            }
        }
        return maxarea;
    }
        
}



