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
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null) return null;
        ListNode curr=head;
        ListNode s=curr;
        ListNode f=curr;
        while(f.next!=null&&f.next.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f) {
                ListNode ptr=head;
                while(ptr!=s){
                    ptr=ptr.next;
                    s=s.next;
                }
                return ptr;
            }
        }
        return null;


    }
}