class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reversedNum = 0;

        while (x > reversedNum) {
            int lastdig = x % 10;
            reversedNum = (reversedNum * 10) + lastdig;
            x /= 10;
        }
         
        return reversedNum == x || reversedNum / 10 == x;
    }
}