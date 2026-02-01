class LRUCache {
     class ListNode {
        int key;
        int val;
        ListNode next;
        ListNode prev;
        ListNode(int key,int val){
            this.key=key;
            this.val=val;
        }


     }
     int cap;
     HashMap<Integer,ListNode> mp;
     ListNode head=new ListNode(-1,-1);
     ListNode tail=new ListNode(-1,-1);

    public LRUCache(int capacity) {
        cap=capacity;
        head.prev=null;
        head.next=tail;
        tail.prev=head;
        tail.next=null;
        mp=new HashMap<>();

        
    }

    private ListNode deleteNodeandadd(ListNode node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
        node.next=head.next;
        node.prev=head;
        head.next.prev=node;
        head.next=node;
        
        return node;

    }
    private void delete(ListNode node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    
    public int get(int key) {
        if(!mp.containsKey(key)) return -1;
        else{
            return(deleteNodeandadd(mp.get(key)).val);
        }

        
    }
    
    public void put(int key, int value) {
        if(mp.containsKey(key)){
            ListNode node=deleteNodeandadd(mp.get(key));
            node.val=value;
            mp.put(key,node);
        }
        else{
           
           if(mp.size()==cap){
            ListNode lru=tail.prev;
               delete(lru);
               mp.remove(lru.key);
           }
            ListNode node=new ListNode(key,value);
            node.next=head.next;
            node.prev=head;
            head.next.prev=node;
            head.next=node;
            mp.put(key,node);
        }

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */