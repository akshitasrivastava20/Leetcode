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
        ListNode mid=middle(head);
        ListNode secondhead=reverse(mid.next);
        mid.next=null;
        ListNode firsthead=head;
        ListNode temp;
        

        while(firsthead!=null && secondhead!=null){
            temp=firsthead.next;
            firsthead.next=secondhead;
            firsthead=temp;
             temp=secondhead.next;
            secondhead.next=firsthead;
            secondhead=temp;
        }


        
    }
      public ListNode middle(ListNode head){
        if(head==null) return head;
        ListNode s=head;
        ListNode f=head;
        while(f != null && f.next != null)
{
            s=s.next;
            f=f.next.next;


        }
        return s;
    }
    public ListNode reverse(ListNode head){
        if(head==null) return head;
        ListNode prev=null;
        ListNode pres=head;
        ListNode nex=head.next;

        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=nex;
            if(nex!=null){
                nex=nex.next;
            }

        }
        return prev;


    }
}