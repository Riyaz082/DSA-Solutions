class Solution {
    public int addDigits(int num) {
        while(num > 9){
            num = addDights(num);
        }

        return num;
    }

    public int addDights(int num){
        int sum = 0;

        while(num > 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        return sum;
    }
}