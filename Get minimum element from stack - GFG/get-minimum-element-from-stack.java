// { Driver Code Starts
import java.util.*;



class Get_Min_From_Stack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			GfG g = new GfG();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
					//System.out.println(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
		
	}
}


// } Driver Code Ends


class GfG
{
    int minEle;
    Stack<Integer> s=new Stack<Integer>(); 
    Stack<Integer> min=new Stack<Integer>();

    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
// 	System.out.print(minEle+" ");
    if(s.size()==0){
        return -1;
    }
     return minEle;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here
	
	if(s.size()==0){
	    return -1;
	}
	
	if(s.peek()==min.peek()){
	    min.pop();
	    if(min.size()!=0){
	    minEle=min.peek();
	    }
	    else{
	        minEle=-1;
	    }
	}
	int t= s.peek();
	s.pop();
	return t;
    }

    /*push element x into the stack*/
    void push(int x)
    {
	// Your code heres
	if(s.size()==0){
	    min.push(x);
	    minEle=x;
	}
	else{
	    if(minEle>=x){
	        min.push(x);
	        minEle=x;
	    }
	}
	s.push(x);
	return;
    }	
}

