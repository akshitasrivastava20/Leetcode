class FreqStack {
    HashMap<Integer,Integer> mp;
    //ele,freq
    int maxfreq;
    HashMap<Integer,Stack<Integer>> fst;
    //freq,stack
    public FreqStack() {
        mp=new HashMap<>();
        maxfreq=0;
        fst=new HashMap<>();
    }
    
    public void push(int val) {
        //freqmap inc
        mp.put(val,mp.getOrDefault(val,0)+1);
        int f=mp.get(val);
        if(f>maxfreq){
            maxfreq=f;

        }
        fst.computeIfAbsent(f,fre->new Stack()).push(val);



        
    }
    
    public int pop() {
       int ans= fst.get(maxfreq).pop();
       mp.put(ans,mp.getOrDefault(ans,0)-1);
       if(fst.get(maxfreq).isEmpty()){
        maxfreq--;
       }
       return ans;
        
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */