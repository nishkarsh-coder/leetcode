// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int t=0;t<testCases;t++){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		    System.out.print("()");
		    ArrayList <ArrayList<Integer>> res = new solve().AllSubsets(arr,n);
		    for (int i = 0; i < res.size (); i++)
		    {
		        System.out.print ("(");
		        for (int j = 0; j < res.get(i).size (); j++)
		        {
		            if (j != res.get(i).size()-1)
		                System.out.print ((res.get(i)).get(j) + " ");
		            else
		                System.out.print ((res.get(i)).get(j));
		        }
		        System.out.print (")");
		      
		    }
		    System.out.println();
		}
	}
}// } Driver Code Ends


class solve
{
    //Function to find all possible unique subsets.
    public static ArrayList <ArrayList <Integer>> AllSubsets(int arr[], int n)
    {
        // your code here
        Arrays.sort(arr);
        // ArrayList<Integer> a=new ArrayList<Integer>();
        // a.add(); 
       ArrayList <ArrayList <Integer>>f =new ArrayList <ArrayList <Integer>>();
        ArrayList<String> ans=helper(arr, 0);
        // System.out.println(ans);
        // f.add(new ArrayList<Integer>());
        for(int i=1;i<ans.size();i++){
            String str=ans.get(i);
            ArrayList<Integer> a=new ArrayList<Integer>();
            for(int j=0;j<str.length();j++){
                char c=str.charAt(j);
                a.add(c-'0');
            }
            f.add(a);
            
        }
        // f.add()
        return f;
    }
    
      public static ArrayList<String> helper(int arr[], int index){
          
          if(index==arr.length){
              ArrayList<String> ans=new ArrayList<String>();
              ans.add("");
              return ans;
          }
            
            
            
            ArrayList<String> ans= helper(arr,index+1);
            HashSet<String> h=new HashSet<>();
            for(String i:ans){
                h.add(i);
                h.add(arr[index]+i);
            }
            ans=new ArrayList<>(h);
            
            Collections.sort(ans);
            return ans;
      }
}
