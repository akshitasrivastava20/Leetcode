import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        // BigInteger a1=new BigInteger(a,2);
        // BigInteger b1=new BigInteger(b,2);

        // BigInteger sum=a1.add(b1);
        // return sum.toString(2);

        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);

        BigInteger sum = num1.add(num2);

        String result = sum.toString(2);

       return result;

    }
}