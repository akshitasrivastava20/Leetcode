class Solution {
    public int[] plusOne(int[] digits) {
        int k=1;
        int[] newdigits=new int[digits.length+1];


        for(int i=digits.length-1;i>=0;i--){
            int sum=digits[i]+k;
               digits[i]=sum%10;
               k=sum/10;
        }
        if(k==0){
           return digits;
        }
        else{
            newdigits[0]=1;
            for(int i=0;i<digits.length;i++){
                newdigits[i+1]=digits[i];
            }
            return newdigits;
        }
        
    }
}