class Solution {
    ArrayList<Integer> ans = new ArrayList<>();

    public int[] separateDigits(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            saprate(nums[i]);
        }

        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }

    public void saprate(int num) {
        String s = String.valueOf(num);

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            ans.add(digit);
        }
    }
}