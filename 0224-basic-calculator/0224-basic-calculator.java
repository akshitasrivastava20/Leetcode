class Solution {

    int i = 0;

    public int calculate(String s) {

        Stack<Integer> t = new Stack<>();
        char opr = '+';
        int num = 0;

        while (i < s.length()) {

            char ch = s.charAt(i);
            i++;

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            else if (ch == '(') {
                num = calculate(s);   // NO substring
            }

            if ((!Character.isDigit(ch) && ch != ' ') || i == s.length()) {

                if (opr == '+') t.push(num);
                else if (opr == '-') t.push(-num);

                opr = ch;
                num = 0;
            }

            if (ch == ')') break;  // stop current recursion
        }

        int res = 0;
        while (!t.isEmpty()) res += t.pop();
        return res;
    }
}
