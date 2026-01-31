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
        ListNode bef=null;
        ListNode p1=head;
        ListNode p2=head;
       int i=0;
        while(i!=n){
            p2=p2.next;
            i++;
        }
        while(p2!=null){
            bef=p1;
            p1=p1.next;
            p2=p2.next;

        }
        if(p1==head){
            head=p1.next;
        }
        else{
        ListNode Next=p1.next;
        bef.next=Next;}

        return head;








    }
}