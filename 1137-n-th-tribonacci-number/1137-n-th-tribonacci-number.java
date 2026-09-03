class Solution {
    public int tribonacci(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return tribonacciNum(dp, n);
    }
    public int tribonacciNum(int[] dp, int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }

        dp[n] = tribonacciNum(dp, n - 3) + tribonacciNum(dp, n - 2) + tribonacciNum(dp, n - 1);
        return dp[n]; 
    }
}