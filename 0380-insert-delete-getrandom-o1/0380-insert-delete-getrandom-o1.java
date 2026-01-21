class RandomizedSet {
     ArrayList<Integer> lst;
     HashMap<Integer,Integer> mp;
     Random rand;
    public RandomizedSet() {
        lst=new ArrayList<>();
        mp=new HashMap<>();
       rand=new Random();

    }
    
    public boolean insert(int val) {
        if(mp.containsKey(val)) return false;
        else{
            lst.add(val);
            mp.put(val,lst.size()-1);
            return true;
        }
        
    }
    
    public boolean remove(int val) {
        if(mp.containsKey(val)){
            int idx=mp.get(val);
            
            
   
            
            //swap
            lst.set(idx,lst.get(lst.size()-1));
            mp.put(lst.get(lst.size()-1),idx);

            mp.remove(val);
            lst.remove(lst.size()-1);
            return true;
        }
        return false;
        
    }
    
    public int getRandom() {
        Random rand=new Random();
        int i=rand.nextInt(mp.size());
        return lst.get(i);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */