class RandomizedSet {
    List<Integer> lst;
    HashSet<Integer> s;
     Random r;
    public RandomizedSet() {
        lst=new ArrayList<>();
        s=new HashSet<>();
         r=new Random();
    }
    
    public boolean insert(int val) {
        if(s.contains(val)) return false;
           s.add(val);
           lst.add(val);
           return true;


        
    }
    
    public boolean remove(int val) {
        if(!s.contains(val)) return false; 
        lst.remove(Integer.valueOf(val));
        s.remove(val);
        return true;
        
    }
    
    public int getRandom() {
        int idx=r.nextInt(lst.size());
        return lst.get(idx);

        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */