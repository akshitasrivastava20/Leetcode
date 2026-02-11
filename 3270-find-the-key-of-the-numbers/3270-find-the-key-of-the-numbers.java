class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int[] key = new int[4];
        int num = 0;
        for (int i = 3; i >= 0; i--) {
            key[i] = Math.min(Math.min(num1 % 10, num2 % 10), num3 % 10);
            num1 = num1 / 10;
            num2 = num2 / 10;
            num3 = num3 / 10;
        }
        for (int i : key) {
            num = num * 10 + i;
        }
        return num;
    }
}