class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        String s1="";
       
        for(int i=0;i<arr.length;i++){
          s1= s1.concat(reverse(arr[i]));

        }
        return s1.trim();
        

    }
    static String reverse(String s){
        return new StringBuilder(s).reverse().toString()+" ";
    }
    
    
}