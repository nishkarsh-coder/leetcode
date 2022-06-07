// { Driver Code Starts
import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
		
public class Absolute_List_Sort
{
    Node head;  
	
	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
 
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) 
	{

		if (head == null) 
			head = node;
		else 
		{
		   Node temp = head;
		   while (temp.next != null)
		   temp = temp.next;

		   temp.next = node;
		}
    }
	  
    /* Drier program to test above functions */
    public static void main(String args[])
    {
       
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
        Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		 
		while(t>0)
        {
			int n = sc.nextInt();
			Absolute_List_Sort llist = new Absolute_List_Sort();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
          
            GfG gfgobj = new GfG(); 
    		llist.head = gfgobj.sortList(llist.head);
    		llist.printList(llist.head);
		
			t--;
		}
	}
}// } Driver Code Ends


/* The structure of the node of the Linked List is
class Node
{
   int data;
   Node next;
   Node(int d) {data = d; next = null; }
 }
*/

class GfG
{   Node reverse(Node h){
    Node prev=null;
    Node next=h;
    while(next!=null){
        Node curr=next.next;
        next.next=prev;
        prev=next;
        next=curr;
    }
    return prev;
}
	Node sortList(Node head) {
		// Your code here
		Node temp=head;
		Node head1=null;
		Node temp1=null;
		Node head2=null;
		Node temp2=null;
		while(temp!=null){
		    if(temp.data<0){
		        if(head2==null){
		            temp2=temp;
		            head2=temp;
		        }
		        else{
		            temp2.next=temp;
		            temp2=temp;
		        }
		    }
		    else{
		        if(head1==null){
		            temp1=temp;
		            head1=temp;
		        }
		        else{
		            temp1.next=temp;
		            temp1=temp;
		        }
		    }
		    temp=temp.next;
		}
		if(temp1==null){
		    head=reverse(head);
		    return head;
		}
		if(temp2==null){
		    
// 		   temp2=head;
// 		while(temp2!=null){
// 		    System.out.println(temp2.data);
// 		    temp2=temp2.next;
// 		}
		    return head;
		}
		temp1.next=null;
		temp2.next=null;
		head2=reverse(head2);
		temp2=head2;
		
		while(temp2.next!=null){
		    temp2=temp2.next;
		}
		temp2.next=head1;
		return head2;
	}
}