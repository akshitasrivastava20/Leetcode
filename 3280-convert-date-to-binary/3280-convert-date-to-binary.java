class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder();
        String[] words = date.split("-");

        for (int i = 0; i < words.length; i++) {
            int num = Integer.parseInt(words[i]);
            sb.append(Integer.toBinaryString(num));
            if (i < words.length - 1) {
                sb.append("-");
            }
        }
        return sb.toString();
    }
}
