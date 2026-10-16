class Solution {
    public int findLengthOfLCIS(int[] nums) {
         int res = 1;
         int max = 1;

         for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){
                max++;
            }
            else{
                max = 1;
            }

            res = Math.max(res, max);
         }

         return res;
    }
}