class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int idx = 0;
        int n = nums.length;
        getPermute(nums, ans, idx, n);
        return ans;
    }

    public void getPermute(int[] nums, List<List<Integer>> ans, int idx, int n) {
        if (idx == n) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) {
                temp.add(num);
            }
            if(ans.contains(temp)) return;
            ans.add(temp);
            return;
        }
        for (int i = idx; i < n; i++) {
            swap(nums, idx, i);
            getPermute(nums, ans, idx + 1, n);
            swap(nums, idx, i);
        }
    }

    public void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}