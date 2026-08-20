class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long currSum = 0;
        long rightSum = 0;
        for (int i = 0; i < n; i++) {
            rightSum += nums[i];
        }
        int valid = 0;
        for (int i = 0; i < n - 1; i++) {
            currSum += nums[i];
            rightSum -= nums[i];
            if (currSum >= rightSum) {
                valid += 1;
            }
        }
        return valid;
    }
}