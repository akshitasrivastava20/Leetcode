/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        
        ListNode mid=findmid(head);
        ListNode reverse=reverse(mid.next);
        ListNode curr=head;
        mid.next=null;
        while(curr!=null&&reverse!=null){
            ListNode temp1=curr.next;
            ListNode temp2=reverse.next;

            curr.next=reverse;
            reverse.next=temp1;
            curr=temp1;
            reverse=temp2;
            
            
            
         }
         




        
    }
    private ListNode findmid(ListNode head){
        ListNode s=head;
        ListNode f=head;
        while(f!=null&&f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    private ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
         
    }
}