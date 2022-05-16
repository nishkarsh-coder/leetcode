// { Driver Code Starts
//Initial Template for Java


import java.util.*; 
import java.io.*; 

class GFG 
{ 
	public static void main (String[] args) { 
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            int array[] = new int[n];
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }

            Solution ob = new Solution();

            int ans[] = ob.help_classmate(array,n);

           	for (int i=0; i<n; i++) 
                System.out.print(ans[i]+" "); 
            System.out.println();
            t--;
        }
	} 
} 

// } Driver Code Ends


//User function Template for Java

class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    // Your code goes here
	    
	    int[] r=new int[n];
	    Stack<Integer> st=new Stack<>();
	    st.push(arr[n-1]);
	    r[n-1]= -1;
	    for(int i=n-2;i>=0;i--){
	        while(st.size()!=0&&arr[i]<=st.peek()){
	            st.pop();
	        }
	        
	        if(st.size()==0){
	           r[i]=-1;
	        }
	        else{
	            r[i]= st.peek();
	        }
	        st.push(arr[i]);
	    }
	    return r;
	} 
}
