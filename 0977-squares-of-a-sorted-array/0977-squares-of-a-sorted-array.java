class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int j = 0;

        for (int i = 0; i < n; i++) {
            int sqr = nums[i] * nums[i];

            int k = j;

            while (k > 0 && res[k - 1] > sqr) {
                res[k] = res[k - 1];
                k--;
            }

            res[k] = sqr;
            j++;
        }

        return res;
    }
}