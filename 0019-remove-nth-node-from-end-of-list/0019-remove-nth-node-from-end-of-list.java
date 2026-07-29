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
        int len=length(head);
        if(len==n) return head.next;
        ListNode curr=head;
        int idx=0;
        while(curr!=null && idx!=len-n-1){
            idx++;
            curr=curr.next;

        }
        curr.next=curr.next.next;
        return head;



        
    }
    private int  length(ListNode head){
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }

}