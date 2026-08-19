class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int maxSum = nums[0];
        int minSum = nums[0];

        int maxResult = nums[0];
        int minResult = nums[0];

        int total = nums[0];

        for (int i = 1; i < nums.length; i++) {

            maxSum = Math.max(maxSum + nums[i], nums[i]);
            minSum = Math.min(minSum + nums[i], nums[i]);

            maxResult = Math.max(maxResult, maxSum);
            minResult = Math.min(minResult, minSum);

            total += nums[i];
        }

        if (maxResult < 0) {
            return maxResult;
        }

        int circularResult = total - minResult;

        return Math.max(maxResult, circularResult);
    }
}