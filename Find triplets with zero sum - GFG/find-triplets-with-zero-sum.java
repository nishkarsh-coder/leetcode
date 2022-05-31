// { Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Solution g=new Solution();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        Arrays.sort(arr);
        
        for(int i=0;i<n;i++){
            int start=0;
            int end=n-1;
            int target=0-arr[i];
            while(start<end){
                if(end!=i&&start!=i&&target==arr[start]+arr[end]){
                    return true;
                }
                else if(end==i||target<arr[end]+arr[start]){
                    end=end-1;
                }
                else{
                    start=start+1;
                }
            }
        }
        return false;
    }
}