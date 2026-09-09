class Solution {
    public boolean judgeSquareSum(int c) {
        if(c < 2){
            return true;
        }

        int low = 0;
        int high = (int) Math.sqrt(c);

        while(low <= high){
            long sqr = (long) low * low + (long) high * high;
            if(sqr == c){
                return true;
            }else if(sqr < c){
                low++;
            }else{
                high--;
            }
        }
        return false;
    }
}