class LRUCache {
    class Node{
        int key;
        int val;
        Node next;
        Node prev;
        Node(int key,int val){
            this.key=key;
            this.val=val;
            next=prev=null;
        }
    }
    Node head;
    Node tail;
    HashMap<Integer,Node> mp;
    int cap;
    public LRUCache(int capacity) {
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
        mp=new HashMap<>();
        cap=capacity;
        
    }

    
    public int get(int key) {
        if(!mp.containsKey(key)) return -1;
        int val=mp.get(key).val;
       
        deleteNode(mp.get(key));
     mp.remove(key);
     Node newnode=new Node(key,val);
        addNode(newnode);
        return val;
        
    }
    
    public void put(int key, int value) {
         if(mp.containsKey(key)){
            Node already=mp.get(key);
            mp.remove(key);
            deleteNode(already);


        }
        if(mp.size()==cap){
            mp.remove(tail.prev.key);
            deleteNode(tail.prev);
            
        }
       

        Node newnode=new Node(key,value);
        addNode(newnode);
        
        
    }
    private void addNode(Node newnode){
        newnode.next=head.next;
        newnode.prev=head;
        head.next.prev=newnode;
        head.next=newnode;

        mp.put(newnode.key,newnode);

    }
    private void deleteNode(Node newnode){
        newnode.prev.next=newnode.next;
        newnode.next.prev=newnode.prev;

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */