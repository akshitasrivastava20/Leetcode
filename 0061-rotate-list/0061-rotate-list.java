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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
         k=k%len(head);
         if (k == 0) return head;
        while(k>0){
            head=rotate(head);
            k--;
        }
        return head;
    }
    public ListNode rotate(ListNode head){
        ListNode temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
            temp.next.next=head;
            head=temp.next;
            temp.next=null;
            return head;


    }
    public int len(ListNode head){
         ListNode temp=head;
         int l=0;
        while(temp!=null){
            temp=temp.next;
            l++;
        }
        return l;
    }
}