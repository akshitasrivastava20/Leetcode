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
        int k=findlen(head);
        int c=1;
        ListNode curr=head;
        //if we need to remove head;
        if(k==n) return head.next;
        while(c!=k-n&&curr!=null){
            c++;
            curr=curr.next;


        }
        curr.next=curr.next.next;
        return head;


        
    }
    private int findlen(ListNode head){
        if(head==null) return 0;
        int l=0;
        ListNode curr=head;
        while(curr!=null){
            l++;
            curr=curr.next;
            

        }
        return l;
    }
}