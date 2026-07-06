class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;

        Arrays.sort(intervals, (vec1, vec2) -> {
            if (vec1[0] == vec2[0]) {
                return vec2[1] - vec1[1];
            }
            return vec1[0] - vec2[0];
        });

        int lastIntervalEnd = intervals[0][1];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (lastIntervalEnd >= intervals[i][1]) {
                continue;
            }
            lastIntervalEnd = intervals[i][1];
            count++;
        }

        return count;
    }
}