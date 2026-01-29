class Solution {
    public int calculate(String s) {

        int n = s.length();
        int sign = 1;
        int ans = 0;
        Stack<Integer> t = new Stack<>();
        int i = 0;

        while (i < n) {

            char ch = s.charAt(i);

            // skip spaces
            if (ch == ' ') {
                i++;
                continue;
            }

            // number
            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < n && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                ans += num * sign;
                continue; // 🔴 VERY IMPORTANT
            }

            // operator
            if (ch == '+') {
                sign = 1;
            } else if (ch == '-') {
                sign = -1;
            }

            // opening bracket
            else if (ch == '(') {
                t.push(ans);
                t.push(sign);
                ans = 0;
                sign = 1;
            }

            // closing bracket
            else if (ch == ')') {
                int prevSign = t.pop();
                int prevAns = t.pop();
                ans = prevAns + prevSign * ans;
            }

            i++;
        }

        return ans;
    }
}
