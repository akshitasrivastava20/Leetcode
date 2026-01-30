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
        if (head == null || k == 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroup = dummy;

        while (true) {
            // check k nodes exist
            ListNode check = prevGroup;
            for (int i = 0; i < k; i++) {
                check = check.next;
                if (check == null) return dummy.next;
            }

            // reverse k nodes using YOUR logic
            ListNode prev = null;
            ListNode curr = prevGroup.next;

            for (int i = 0; i < k; i++) {
                ListNode Next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = Next;
            }

            // reconnect
            ListNode start = prevGroup.next; // old start, now tail
            prevGroup.next = prev;           // connect previous group
            start.next = curr;               // connect to next group

            // move prevGroup
            prevGroup = start;
        }
    }
}
