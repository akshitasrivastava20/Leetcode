class MyCircularQueue {
    int[] arr;
    int f,r,len;


    public MyCircularQueue(int k) {
        arr=new int[k];
        f=0;
        r=-1;
        len=0;


        
    }
    
    public boolean enQueue(int value) {
        if(!isFull()){
            r=(r+1)%arr.length;
            arr[r]=value;
            len++;
            return true;


        }
        else return false;
        
    }
    
    public boolean deQueue() {
        if(!isEmpty()){
            f=(f+1)%arr.length;
            len--;
            return true;
        }
        else return false;
        
    }
    
    public int Front() {
        if(!isEmpty()){
             return arr[f];
        }
        return -1;
       
        
    }
    
    public int Rear() {
        if(!isEmpty()){
             return arr[r];
        }
        return -1;
        
    }
    
    public boolean isEmpty() {
        return len==0;
    }
    
    public boolean isFull() {
        return len==arr.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */