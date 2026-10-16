class Solution {
    public int maxPower(String s) {
        int maxSize = 1, max = 1;

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                max++;
            }else{
                max = 1;
            }

            maxSize = Math.max(maxSize, max);
        }

        return maxSize;
    }
}