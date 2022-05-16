// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		     
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    Complete obj = new Complete();
		    int ans = obj.save_gotham(arr, sizeOfArray);
		    System.out.println(ans);
		}
	}
}



// } Driver Code Ends


//User function Template for Java

class Complete{
    
   
    // Function for finding maximum and value pair
    public static int save_gotham (int arr[], int n) {
        //Complete the function
        
      Stack<Integer> st=new Stack<>();
       ArrayList<Integer> r=new ArrayList<Integer>(n);
      
      r.add(0);
      st.push(arr[n-1]);
      for(int i=n-2;i>=0;i--){
          while(st.size()!=0&& arr[i]>=st.peek()){
              st.pop();
          }
          
          if(st.size()==0){
              r.add(0);
          }else{
              r.add(st.peek());
          }
          st.push(arr[i]);
      }
      int ans=0;
      for(int i=0;i<n;i++){
          ans+=r.get(i);
          if(ans>=1000000001){
          ans=ans%1000000001;
          }
      }
      return ans;
    }
    
    
}


