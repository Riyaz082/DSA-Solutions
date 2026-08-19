class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int lsum = 0, rsum = 0;

        for (int i = 0; i < n; i++) {
            if (i == 0)
                rsum = sum(nums, i + 1, n);
            else {
                rsum = rsum - nums[i];
                lsum = lsum + nums[i - 1];
            }

            if (lsum == rsum)
                return i;
        }
        return -1;
    }

    public int sum(int[] nums, int start, int end) {
        int res = 0;
        for (int i = start; i < end; i++) {
            res = res + nums[i];
        }
        return res;
    }
}