// { Driver Code Starts
import java.util.*;
import java.io.*;

class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}


class Merge_2_sorted_ll_In_ReverseOrder
{
    Node head;

    void addToTheLast(Node node)
    {
        if(head == null)
            head = node;
        else
        {
            Node temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    void printList(Node node)
    {
        while(node!= null)
        {
            System.out.print(node.data+ " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String args[]) throws IOException
    {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t>0)
        {
            String nums[] = br.readLine().split(" ");
            int n1 = Integer.parseInt(nums[0]);
            int n2 = Integer.parseInt(nums[1]);
            Merge_2_sorted_ll_In_ReverseOrder list = new Merge_2_sorted_ll_In_ReverseOrder();
            nums = br.readLine().split(" ");
            int a1 = Integer.parseInt(nums[0]);
            Node head = new Node(a1);
            list.addToTheLast(head);
            for(int i=1;i<n1;i++)
            {
                int a = Integer.parseInt(nums[i]);
                list.addToTheLast(new Node(a));
            }
            //list.printList(list.head);

            Merge_2_sorted_ll_In_ReverseOrder list2 = new Merge_2_sorted_ll_In_ReverseOrder();
            nums = br.readLine().split(" ");
            int b1 = Integer.parseInt(nums[0]);
            Node head1 = new Node(b1);
            list2.addToTheLast(new Node(b1));
            for(int j=1;j<n2;j++)
            {
                int b = Integer.parseInt(nums[j]);
                list2.addToTheLast(new Node(b));				
            }
            //list.printList(list2.head);
            
            GfG g = new GfG();
            Node result = g.mergeResult(list.head, list2.head);
            list.printList(result);
            t--;
        }
    }
}// } Driver Code Ends


/* Structure of the node*/
/* class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
} */

class GfG
{
    
    Node reverse(Node head){
        Node prev=null;
        Node next=head;
        while(next!=null){
            Node curr=next.next;
            next.next=prev;
            prev=next;
            next=curr;
        }
        return prev; 
    }
    Node mergeResult(Node node1, Node node2)
    {
	// Your code here	
	node1=reverse(node1);
	node2=reverse(node2);
	Node head=null;
	Node prev=null;
// 	return node2;
	while(node1!=null&&node2!=null){
	    if(node1.data>node2.data){
	        if(head==null){
	            head=node1;
	            prev=node1;
	        }
	        else{
	            prev.next=node1;
	            prev=node1;
	        }
	    node1=node1.next;
	    }
	    else{
	        if(head==null){
	            head=node2;
	            prev=node2;
	        }
	        else{
	            prev.next=node2;
	            prev=node2;
	        }
	    node2=node2.next;
	    }
	}
	while(node1!=null){
	    if(head==null){
	            head=node1;
	            prev=node1;
	        }
	        else{
	            prev.next=node1;
	            prev=node1;
	        }
	        node1=node1.next;
	}
	
	while(node2!=null){
	    if(head==null){
	            head=node2;
	            prev=node2;
	        }
	        else{
	            prev.next=node2;
	            prev=node2;
	        }
	        node2=node2.next;
	}
	prev.next=null;
	return head;
    }
}
