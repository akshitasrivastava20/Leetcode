class Solution {
    public int romanToInt(String s) {
        

        char[] chr=s.toCharArray();int num;
        HashMap<Character,Integer> mp=new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        
        mp.put('D',500);
        mp.put('M',1000);
        num=mp.get(chr[chr.length-1]);
        for(int i=chr.length-2;i>=0;i--){
             if(mp.get(chr[i])>=mp.get(chr[i+1])){
                num+=mp.get(chr[i]);
             }
             else{
                num-=mp.get(chr[i]);
             }
        }
        
        return num;

        
    }
}