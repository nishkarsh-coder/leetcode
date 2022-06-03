// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}// } Driver Code Ends


/*Complete the function below*/
class GfG{
    static void insert(int x, Stack<Integer> s){
        if(s.size()==0){
         s.push(x);
        }else{
            int a=s.pop();
            if(x<a){
            insert(x,s);
            s.push(a);
            }
            else{
                s.push(a);
                s.push(x);
            }
        }
        
    }
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		if(s.size()==0){
		    return s;
		}
		int x=s.pop();
	    s=sort(s);
		insert(x,s);
		return s;
// 		sort();
	}
}