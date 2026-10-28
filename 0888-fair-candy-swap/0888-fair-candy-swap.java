class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;

        for (int candy : aliceSizes) {
            sumA += candy;
        }

        for (int candy : bobSizes) {
            sumB += candy;
        }

        int diff = (sumA - sumB) / 2;

        HashSet<Integer> set = new HashSet<>();

        for (int candy : aliceSizes) {
            set.add(candy);
        }

        for (int candy : bobSizes) {
            int required = candy + diff;

            if (set.contains(required)) {
                return new int[]{required, candy};
            }
        }

        return new int[0];
    }
}