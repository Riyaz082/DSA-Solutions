class Solution {
    public int countEven(int num) {
        int res = 0;

        for (int i = 2; i <= num; i++) {
            int sum = digitSum(i);

            if (sum % 2 == 0) {
                res++;
            }
        }

        return res;
    }

    public int digitSum(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        return sum;
    }
}