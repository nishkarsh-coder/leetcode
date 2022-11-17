//{ Driver Code Starts
import java.util.*;

class Distinct_Occurrences
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String line = sc.nextLine();
			String S = line.split(" ")[0];
			String T = line.split(" ")[1];
			
			Solution ob = new Solution();
			System.out.println(ob.subsequenceCount(S,T));
			t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete this method*/

class Solution
{
    int  subsequenceCount(String S, String T)
    {
	// Your code here	
	int[] prev=new int[T.length()+1];
// 	prev[0]=1;/
prev[T.length()]=1;
	
// 	for(int i=1;i<=S.length();i++){
// 	    int[] curr=new int[T.length()+1];
// 	    for(int j=1;j<=T.length();j++){
// 	        if(S.charAt(i-1)==T.charAt(j-1)){
// 	            curr[j]=prev[j-1];    
// 	        }
// 	        curr[j]=curr[j]+prev[j];
// 	    }
	    
// 	    prev=curr;
// 	}
    int num=1000000007;
	for(int i=S.length()-1;i>=0;i--){
	    int[] curr=new int[T.length()+1];
	    curr[T.length()]=1;
	    for(int j=T.length()-1;j>=0;j--){
	        if(S.charAt(i)==T.charAt(j)){
	            curr[j]=prev[j+1];    
	        }
	        curr[j]=(curr[j]+prev[j])%num;
	    }
	    
	    prev=curr;
	   // System.out.println(Arrays.toString(prev));
	}



	return prev[0];
	
    }
}