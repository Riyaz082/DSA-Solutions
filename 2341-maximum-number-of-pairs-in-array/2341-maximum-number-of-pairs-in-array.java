class Solution {
    public int[] numberOfPairs(int[] nums) {
        Arrays.sort(nums);

        int pairs = 0;
        int left = 0;

        for (int i = 0; i < nums.length; ) {

            if (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                pairs++;
                i += 2;
            } 
            else {
                left++;
                i++;
            }
        }

        return new int[]{pairs, left};
    }
}