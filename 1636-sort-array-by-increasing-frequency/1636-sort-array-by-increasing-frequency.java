class Solution {
    public int[] frequencySort(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> {
            if (map.get(a) != map.get(b)) {
                return map.get(a) - map.get(b);
            }

            return b - a;
        });

        int[] ans = new int[nums.length];
        int index = 0;

        for (int num : list) {

            int freq = map.get(num);

            for (int i = 0; i < freq; i++) {
                ans[index++] = num;
            }
        }

        return ans;
    }
}