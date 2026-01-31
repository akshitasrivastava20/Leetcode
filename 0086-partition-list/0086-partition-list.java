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
    public ListNode partition(ListNode head, int x) {
        if(head==null||head.next==null) return head;
        ListNode bef1=new ListNode(0);
        ListNode bef=bef1;
        ListNode after1=new ListNode(0);
        ListNode after=after1;

        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                bef.next=temp;
                bef=bef.next;
            }
            else{
                after.next=temp;
                after=after.next;

            }
            temp=temp.next;

        }
         after.next = null;
        bef.next=after1.next;

        return bef1.next;


    }
    
}