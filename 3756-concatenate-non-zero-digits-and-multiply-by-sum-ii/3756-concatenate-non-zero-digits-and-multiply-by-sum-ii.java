class Solution {
    static final long MOD = 1_000_000_007L;

    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();

        int[] nonZeroCount = new int[n];
        long[] numberUpTo = new long[n];
        long[] digitSumUpTo = new long[n];
        long[] pow10 = new long[n + 1];

        pow10[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow10[i] = (pow10[i - 1] * 10) % MOD;
        }

        int firstDigit = s.charAt(0) - '0';
        nonZeroCount[0] = (firstDigit != 0) ? 1 : 0;
        numberUpTo[0] = firstDigit;
        digitSumUpTo[0] = firstDigit;

        for (int i = 1; i < n; i++) {
            int digit = s.charAt(i) - '0';
            
            nonZeroCount[i] = nonZeroCount[i - 1] + (digit != 0 ? 1 : 0);
            digitSumUpTo[i] = digitSumUpTo[i - 1] + digit;

            if (digit != 0) {
                numberUpTo[i] = (numberUpTo[i - 1] * 10 + digit) % MOD;
            } else {
                numberUpTo[i] = numberUpTo[i - 1];
            }
        }

        int q = queries.length;
        int[] result = new int[q];

        for (int i = 0; i < q; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            long numBefore = (l == 0) ? 0 : numberUpTo[l - 1];
            int startCount = (l == 0) ? 0 : nonZeroCount[l - 1];
            int endCount = nonZeroCount[r];
            int actualLen = endCount - startCount;

            if (actualLen == 0) {
                result[i] = 0;
                continue;
            }

            long subtractedPart = (numBefore * pow10[actualLen]) % MOD;
            long x = (numberUpTo[r] - subtractedPart + MOD) % MOD;

            long sum = digitSumUpTo[r] - ((l == 0) ? 0 : digitSumUpTo[l - 1]);
            sum = sum % MOD;

            result[i] = (int) ((x * sum) % MOD);
        }

        return result;
    }
}