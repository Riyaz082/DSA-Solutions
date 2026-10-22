class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack<>();
        int[] last = new int[26];
        boolean[] seen = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (seen[ch - 'a']) {
                continue;
            }

            while (!st.isEmpty() && st.peek() > ch && last[st.peek() - 'a'] > i) {
                seen[st.pop() - 'a'] = false;
            }

            st.push(ch);
            seen[ch - 'a'] = true;
        }

        StringBuilder res = new StringBuilder();

        for (char ch : st) {
            res.append(ch);
        }

        return res.toString();
    }
}