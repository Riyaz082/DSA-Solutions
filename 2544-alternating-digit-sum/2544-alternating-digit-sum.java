class Solution {
    public int alternateDigitSum(int n) {
        int digits = String.valueOf(n).length();
        int sum = 0;
        int sign = digits % 2 == 0 ? -1 : 1;

        while (n > 0) {
            int digit = n % 10;

            sum += digit * sign;

            sign *= -1;
            n /= 10;
        }

        return sum;
    }
}