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
        if(head==null||head.next==null||k==0) return head;
        
        int n=findlength(head);
        k=k%n;
        if(k==0) return head;
        ListNode br=findkth(head,n-k-1);
        ListNode newhead=br.next;
        br.next=null;
        ListNode temp=newhead;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;

        return newhead;




    }
    private int findlength(ListNode head){
          ListNode temp=head;
          int n=0;
          while(temp!=null){
            temp=temp.next;
            n++;
          }
          return n;
    }
    private ListNode findkth(ListNode head,int k){
        ListNode temp=head;
        int i=0;
        while(temp!=null&& i<k){
            temp=temp.next;
            i++;
        }
        return temp;
    }


    

}