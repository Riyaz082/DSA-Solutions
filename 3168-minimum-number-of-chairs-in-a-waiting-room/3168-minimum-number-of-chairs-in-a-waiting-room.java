class Solution {
    public int minimumChairs(String s) {
        int minChairs = 0, max = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == 'E'){
                max++;
                minChairs = Math.max(minChairs, max);
            }else{
                max--;
            }
        }

        return minChairs;
    }
}