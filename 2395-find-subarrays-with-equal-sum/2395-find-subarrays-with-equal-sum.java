class Solution {
    public boolean findSubarrays(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        int i = 0, j = 1;

        while (j < n) {
            int sum = nums[i] + nums[j];
            
            if (set.contains(sum)) {
                return true;
            } else {
                set.add(sum);
            }
            i++;
            j++;
        }
        return false;
    }
}