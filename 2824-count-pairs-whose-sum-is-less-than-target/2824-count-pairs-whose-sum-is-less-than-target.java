class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        int start = 0, end = nums.size() - 1;

        Collections.sort(nums);

        while (start < end) {
            int sum = nums.get(start) + nums.get(end);

            if (sum < target) {
                count += end - start;
                start++;
            } else {
                end--;
            }
        }

        return count;
    }
}
