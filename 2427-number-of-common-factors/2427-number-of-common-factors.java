class Solution {
    public int commonFactors(int a, int b) {
        int count = 0, i = 1;

        while(i <= a && i <= b){
            if(a % i == 0 && b % i == 0){
                count++;
            }

            i++;
        }

        return count;
    }
}