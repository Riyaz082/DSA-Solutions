class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int minSum = nums[0];
        int res = Math.abs(nums[0]);

        for(int i = 1; i < n; i++){
            maxSum = Math.max(maxSum + nums[i], nums[i]);
            minSum = Math.min(minSum + nums[i], nums[i]);
            res = Math.max(res, Math.max(maxSum, Math.abs(minSum)));
        }
        return res;
    }
}