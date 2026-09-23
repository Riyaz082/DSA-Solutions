class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> diary = new ArrayList<>();

        return combinations(n, k, res, diary, 1);
    }

    public List<List<Integer>> combinations(int n, int k, List<List<Integer>> res, List<Integer> diary, int idx) {

        if (diary.size() == k) {
            res.add(new ArrayList<>(diary));
            return res;
        }

        for (int i = idx; i <= n; i++) {

            diary.add(i);

            combinations(n, k, res, diary, i + 1);

            diary.remove(diary.size() - 1);
        }

        return res;
    }
}