/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) 
    {
        if(head==null) return null;
        HashMap<Node,Node> mp=new HashMap<>();
        Node newhead=new Node(head.val);
        Node temp2=newhead;
        Node temp1=head;
        mp.put(head,newhead);
        while(temp1.next!=null){

            temp2.next=new Node(temp1.next.val);
           

            temp1=temp1.next;
            temp2=temp2.next;
             mp.put(temp1,temp2);


        }
        temp1=head;
        temp2=newhead;

        while(temp2!=null){
            temp2.random=mp.get(temp1.random);
            temp2=temp2.next;
            temp1=temp1.next;

        }
        return newhead;


        
    }
}