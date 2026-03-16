class Solution {
    public String decodeString(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<StringBuilder> st1 = new Stack<>();

        for(int i = 0; i < s.length(); i++){

            if(Character.isDigit(s.charAt(i))){
                int num = 0;
                while(i < s.length() && Character.isDigit(s.charAt(i))){
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                st.push(num);
                i--; // important because loop will increment
            }

            else if(s.charAt(i) == '['){
                st1.push(new StringBuilder("["));  // mark start
            }

            else if(s.charAt(i) == ']'){
                StringBuilder sb = new StringBuilder();

                while(!st1.peek().toString().equals("[")){
                    sb.insert(0, st1.pop());
                }

                st1.pop(); // remove "["

                int c = st.pop();
                String res = sb.toString().repeat(c);
                st1.push(new StringBuilder(res));
            }

            else{
                st1.push(new StringBuilder(String.valueOf(s.charAt(i))));
            }
        }

        StringBuilder ans = new StringBuilder();
        while(!st1.isEmpty()){
            ans.insert(0, st1.pop());
        }

        return ans.toString();
    }
}