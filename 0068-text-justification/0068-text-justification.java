class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        ArrayList<String> lst = new ArrayList<>();
        int index = 0;
        int s = 0;

        while (index < words.length) {

            int count = words[index].length();
            index++;

            // count how many words fit
            while (index < words.length && count + 1 + words[index].length() <= maxWidth) {
                count += 1 + words[index].length();
                index++;
            }

            int last = index - 1;

            // count characters
            int chars = 0;
            for (int i = s; i <= last; i++) {
                chars += words[i].length();
            }

            int spaces = maxWidth - chars;
            int gaps = last - s;

            StringBuilder sb = new StringBuilder();

            // last line OR single word
            if (index == words.length || gaps == 0) {
                for (int i = s; i <= last; i++) {
                    sb.append(words[i]);
                    if (i < last) sb.append(" ");
                }
                while (sb.length() < maxWidth) sb.append(" ");
            } 
            // fully justified
            else {
                int perSpace = spaces / gaps;
                int extra = spaces % gaps;

                for (int i = s; i <= last; i++) {
                    sb.append(words[i]);
                    if (i < last) {
                        for (int k = 0; k < perSpace; k++) sb.append(" ");
                        if (extra-- > 0) sb.append(" ");
                    }
                }
            }

            lst.add(sb.toString());
            s = index;
        }

        return lst;
    }
}
