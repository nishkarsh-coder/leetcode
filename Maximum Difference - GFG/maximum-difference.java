// { Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
			Solution ob = new Solution();
			System.out.println(ob.findMaxDiff(a,n));
		t--;
		}
	}
}// } Driver Code Ends



class Solution
{
    int findMaxDiff(int a[], int n)
    {
	// Your code here	
	 int[] r=new int[n];
     Stack<Integer> st=new Stack<Integer>();
      st.push(a[n-1]);
	  r[n-1]=0;
	for(int i=n-2;i>=0;i--){
	    while(st.size()!=0&& a[i]<=st.peek()){
	        st.pop();
	    }
	    if(st.size()==0){
	        r[i]=0;
	    }
	    else{
	        r[i]=st.peek();
	    }
	    st.push(a[i]);
	}
	 
	 int[] l=new int[n];
     Stack<Integer> stl=new Stack<Integer>();
	  stl.push(a[0]);
	  l[0]=0;
	for(int i=1;i<n;i++){
	    while(stl.size()!=0&& a[i]<=stl.peek()){
	        stl.pop();
	    }
	    if(stl.size()==0){
	        l[i]=0;
	    }
	    else{
	        l[i]=stl.peek();
	    }
	    stl.push(a[i]);
	}
	int ans=0;
	
	
	
	for(int i=0;i<n;i++){
	    
	   // System.out.println(r[i]+" "+l[i]);
	    int diff=l[i]-r[i];
	    if(diff<0){
	        diff=-diff;
	    }
	    if(ans<diff){
	        ans=diff;
	    }
	}
// 	System.out.println("____________________");
	return ans;
	
    }
}