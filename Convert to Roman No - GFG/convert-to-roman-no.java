// { Driver Code Starts
import java.util.Scanner;
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int N = sc.nextInt();
			
			Solution ob = new Solution();
			System.out.println(ob.convertToRoman(N));
			t--;
		}
	}
}// } Driver Code Ends


//User function template for JAVA

class Solution
{
	String convertToRoman(int nums) {
		//code here
		   String ans="";
        while(nums>0){
        if(nums>=1000){
        int r=nums/1000;
        nums=nums%1000;
            for(int i=0;i<r;i++){
                             ans+="M";  

            }
        }
            else if(nums>899&&nums<1000){
                ans+="CM";
                nums=nums%900;
            }
            
        else if(nums>=500){
            int r=nums/500;
            nums=nums%500;
                              ans+="D";  

        }
             else if(nums<500&&nums>399){
                ans+="CD";
                nums=nums%400;
            }
        else if(nums>=100){
            int r=nums/100;
        nums=nums%100;
                                    for(int i=0;i<r;i++){
                   ans+="C";  
 

            } 

        }
             else if(nums>89&&nums<100){
                ans+="XC";
                nums=nums%90;
            }
            else if(nums>=50){
            int r=nums/50;
        nums=nums%50;
                              ans+="L";  

        }
             else if(nums<50&&nums>39){
                ans+="XL";
                nums=nums%40;
            }
            else if(nums>=10){
            int r=nums/10;
        nums=nums%10;
                // if(nums==0){
                     for(int i=0;i<r;i++){
                   ans+="X";  
 

            } 
                // }
            

        }
             else if(nums%9==0){
                ans+="IX";
                nums=0;
            }
            else if(nums>=5){
            int r=nums/5;
            nums=nums%5;
         
                 ans+="V";
        }
             else if(nums%4==0){
                ans+="IV";
                nums=0;
            }
            else if(nums>=1){
            int r=nums/1;
            nums=0;
            for(int i=0;i<r;i++){
                  ans+="I";  
            }
        }
            
        
        }
        return ans;
	}
}