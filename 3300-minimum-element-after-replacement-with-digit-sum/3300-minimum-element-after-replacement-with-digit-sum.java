class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int digitSum = digitSum(nums[i]);
            min = Math.min(min, digitSum);
        }

        return min;
    }

    public int digitSum(int n){
        int sum = 0;

        while(n > 0){
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }

        return sum;
    }
}