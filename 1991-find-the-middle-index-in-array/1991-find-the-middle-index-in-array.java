class Solution {

    public int findMiddleIndex(int[] nums) {

        int n = nums.length;
        int lsum = 0;
        int total = 0;

        for (int i = 0; i < n; i++) {
            total += nums[i];
        }

        for (int i = 0; i < n; i++) {

            int rsum = total - lsum - nums[i];

            if (lsum == rsum)
                return i;

            lsum += nums[i];
        }

        return -1;
    }
}