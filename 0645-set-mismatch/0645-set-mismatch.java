
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        long sum = 0, squareSum = 0;

        for (int num : nums) {
            sum += num;
            squareSum += (long) num * num;
        }

        long expectedSum = (long) n * (n + 1) / 2;
        long expectedSquareSum = (long) n * (n + 1) * (2L * n + 1) / 6;

        long diff = expectedSum - sum;
        long squareDiff = expectedSquareSum - squareSum;

        long total = squareDiff / diff;

        int missing = (int) ((total + diff) / 2);
        int duplicate = (int) (missing - diff);

        return new int[] { duplicate, missing };
    }
}
