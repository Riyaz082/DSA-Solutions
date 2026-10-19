class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] res = new int[2];
        int j = 0;
        boolean[] seen = new boolean[nums.length - 2];

        for(int num : nums){
            if(seen[num]){
                res[j++] = num;
            }else{
                seen[num] = true;
            }
        }
         
        return res;
    }
}