class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int val = 0;

        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                val++;
            }else if(operations[i].equals("--X") || operations[i].equals("X--")){
                val--;
            }
        }

        return val;
    }
}