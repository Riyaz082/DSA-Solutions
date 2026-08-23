class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int j = 0;
        for(int i = 0; i < n/2; i++){
            if(nums[j] != nums[j+1]){
                return false;
            }
            j += 2;
        }
        return true;
    }
}