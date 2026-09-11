class Solution {

    Map<Character, String> map = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        backtrack(0, digits, new StringBuilder(), ans);

        return ans;
    }

    void backtrack(int index, String digits, StringBuilder current, List<String> ans) {

        if (index == digits.length()) {
            ans.add(current.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letters = map.get(digit);

        for (char ch : letters.toCharArray()) {
            current.append(ch);
            backtrack(index + 1, digits, current, ans);
            current.deleteCharAt(current.length() - 1);
        }
    }
}