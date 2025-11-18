/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int l=cycleLength(head);
        if(l==0) return null;
        ListNode f=head;
        ListNode s=head;
        int i=l;
        while(i!=0){
            s=s.next;
            i--;
        }
        // while(l!=0){
        //     f=f.next;
        //     s=s.next;
        //     l--;
        // }
         while (f != s) {
            f = f.next;
            s = s.next;
        }
        return f;


        
    }
    public int cycleLength(ListNode head){
        ListNode f=head;
        ListNode s=head;
        while(f!=null&&f.next!=null){
            s=s.next;
            f=f.next.next;
            if(f==s){
                int length=0;
                do{ 
                    s=s.next;
                    length++;

                    if(f==s){
                       return length;

                    }
                }while(s!=f);
            }
        }
        return 0;

    }
}