class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {

        nums.sort((a, b) -> a.get(0) - b.get(0));

        int start = nums.get(0).get(0);
        int end = nums.get(0).get(1);

        int ans = 0;

        for (int i = 1; i < nums.size(); i++) {

            int start2 = nums.get(i).get(0);
            int end2 = nums.get(i).get(1);

            if (end >= start2) {
                end = Math.max(end, end2);
            } else {
                ans += end - start + 1;

                start = start2;
                end = end2;
            }
        }

        ans += end - start + 1;

        return ans;
    }
}