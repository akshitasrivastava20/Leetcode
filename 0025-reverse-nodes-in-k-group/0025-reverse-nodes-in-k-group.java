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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
         ListNode prevgroup=null;
        while(temp!=null){
           
            ListNode kth=findKth(temp,k);
            if(kth==null){
                if(prevgroup!=null) prevgroup.next=temp;
                break;
            }
            ListNode nextgroup=kth.next;
            kth.next=null;
            ListNode newhead=reverse(temp);
           
            if(head==temp){
                head=newhead;
            }
            else{
                prevgroup.next=newhead;
            }
            prevgroup=temp;
            
             
            temp.next=nextgroup;
            temp=temp.next;

        }
        return head;



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
    private ListNode findKth(ListNode head,int k){
        ListNode kth=head;
        int i=0;
        while(kth!=null&&i<k-1){
            kth=kth.next;
            i++;
        }
        return kth;

    }
}