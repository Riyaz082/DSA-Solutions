class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n];
        int m = 0;

        for (int num : nums) {
            if (num >= 0) {
                arr[m++] = num;
            }
        }

        if (m == 0)
            return nums;

        k %= m;

        int[] rotated = new int[m];

        for (int i = 0; i < m; i++) {
            rotated[i] = arr[(i + k) % m];
        }

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                nums[i] = rotated[j++];
            }
        }

        return nums;
    }
}
