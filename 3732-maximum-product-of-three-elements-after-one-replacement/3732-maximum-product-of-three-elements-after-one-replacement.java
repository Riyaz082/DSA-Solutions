class Solution {
    public long maxProduct(int[] nums) {
        Arrays.sort(nums);
        
        long min = nums[0];
        long smin = nums[1];

        int n = nums.length;
        long smax = nums[n - 2];
        long max = nums[n - 1];

        long x = 100000;

        long case1 = min * smin * x;
        long case2 = max * smax * x;
        long case3 = min * max * (-x);

        return Math.max(case1, Math.max(case2, case3));
    }
}