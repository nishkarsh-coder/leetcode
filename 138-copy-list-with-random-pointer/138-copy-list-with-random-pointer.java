/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> h=new HashMap<>();
        Node temp=head;
        while(head!=null){
        Node copy=new Node(head.val);
            h.put(head,copy);
            head=head.next;
        }
        head=temp;
        while(head!=null){
            h.get(head).next=h.get(head.next);
                h.get(head).random=h.get(head.random);
                head=head.next;
        }
        return h.get(temp);
    }
}