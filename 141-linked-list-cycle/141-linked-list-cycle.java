/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hm=new HashSet<>();
        while(head!=null){
            if(hm.contains(head)){
                return true;
            }
            hm.add(head);
            head=head.next;
        }
        return false;
    }
}