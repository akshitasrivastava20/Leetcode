class Solution {
    public List<String> buildArray(int[] target, int n) {
       ArrayList<String> lst=new ArrayList<>();
       Stack<Integer> stack=new Stack<>();
            int k=0;

           int i=1;
           while(k<target.length&&i<=n){
             stack.push(i);
             lst.add("Push");
             i++;
             if(stack.peek()!=target[k]){
                stack.pop();
                lst.add("Pop");
             }
             else{
                k++;
             }

           }
       return lst;
       
    }
}