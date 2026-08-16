class Solution {
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        while(fast != 1){
            slow = digitSum(slow);
            fast = digitSum(fast);
            fast = digitSum(fast);

            if(slow == fast && slow != 1){
                return false;
            }
        }
        return true;
    }
    public static int digitSum(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum = sum + (digit*digit);
            n /= 10;
        }
        return sum;
    }
}