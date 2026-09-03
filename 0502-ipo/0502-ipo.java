class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {

        int n = profits.length;

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>(
                Arrays.asList(capital[i], profits[i])
            ));
        }

        list.sort((a, b) -> a.get(0) - b.get(0));

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        int idx = 0;

        while (k > 0) {

            while (idx < n && list.get(idx).get(0) <= w) {
                pq.add(list.get(idx).get(1));
                idx++;
            }

            if (pq.isEmpty()) {
                return w;
            }

            w += pq.poll();

            k--;
        }

        return w;
    }
}