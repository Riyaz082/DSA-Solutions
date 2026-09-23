class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> diary = new ArrayList<>();

        combination(candidates, target, diary, res, 0, 0);

        return res;
    }

    public List<List<Integer>> combination(int[] candidates, int target, List<Integer> diary, List<List<Integer>> res,
            int sum, int idx) {

        if (idx == candidates.length) {

            if (sum == target) {
                res.add(new ArrayList<>(diary));
            }

            return res;
        }

        combination(candidates, target, diary, res, sum, idx + 1);

        if (sum + candidates[idx] <= target) {
            diary.add(candidates[idx]);
            sum += candidates[idx];

            combination(candidates, target, diary, res, sum, idx);

            diary.remove(diary.size() - 1);
            sum -= candidates[idx];
        }

        return res;
    }
}