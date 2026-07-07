class Solution {
    public long sumAndMultiply(int n) {
        long reverseX = 0, sum = 0;
        while (n > 0) {
            long digit = n % 10;
            if (digit != 0) {
                reverseX = reverseX * 10 + digit;
                sum += digit;
            }
            n /= 10;
        }
        long x = 0;
        while (reverseX > 0) {
            x = x * 10 + (reverseX % 10);
            reverseX /= 10;
        }
        return x * sum;
    }
}