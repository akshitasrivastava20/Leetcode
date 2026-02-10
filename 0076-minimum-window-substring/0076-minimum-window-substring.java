class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int l = 0;
        int r = 0;
        int minstart=0;
        int minlen = Integer.MAX_VALUE;
        int count = 0;
        // make hashmap of t
        for (char c : t.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        //traverse over entire s 
        while (r < s.length()) {
            char ch = s.charAt(r);
            mp.put(ch, mp.getOrDefault(ch, 0) - 1);
            if (mp.get(ch) >= 0)
                count++;

            while (count == t.length()) {
                if (r - l + 1 < minlen) {
                    minlen = r - l + 1;
                    minstart=l;

                }
                mp.put(s.charAt(l),mp.get(s.charAt(l))+1);
                if(mp.get(s.charAt(l))>0) count--;
                l++;

            }
            r++;
            
        }
        return minlen == Integer.MAX_VALUE ? "" 
               :  s.substring(minstart,minstart+minlen);

    }
}