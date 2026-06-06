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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int idx=findlen(head);
        ListNode curr=head;
        int i=1;
        if(idx==n) return head.next;
        while(curr!=null&&i<idx-n){
            curr=curr.next;
            i++;
        }
         curr.next=curr.next.next;
        return head;


        
    }
    private int findlen(ListNode head){
        if(head==null) return 0;
        ListNode curr=head;
        int c=0;
        while(curr!=null){
            c++;
            curr=curr.next;
        }
        return c;
    }
}