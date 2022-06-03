// { Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}// } Driver Code Ends


class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	     if(n<3){
	        return -1;
	    }
	    int max1=0;
	    int max2=0;
	    int max3=0;
	    for(int i=0;i<n;i++){
	        if(max1<a[i]){
	            max3=max2;
	            max2=max1;
	            max1=a[i];
	        }
	        else if(max2<a[i]){
	            max3=max2;
	            max2=a[i];
	        }
	        else if(max3<a[i]){
	            max3=a[i];
	        }
	           // System.out.println("max1: "+max1+" max2: "+max2+" max3: "+max3);
	    }
	   // System.out.println(max1);
	   //  System.out.println(max2);
	   //   System.out.println(max3);
	    return max3;
    }
}
