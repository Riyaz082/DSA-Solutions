class Solution {
    public int getLucky(String s, int k) {

        StringBuilder num = new StringBuilder();

        for (char c : s.toCharArray()) {
            num.append(c - 'a' + 1);
        }

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum = 0;

            for (int j = 0; j < num.length(); j++) {
                sum += num.charAt(j) - '0';
            }

            num = new StringBuilder(String.valueOf(sum));
        }

        return sum;
    }
}