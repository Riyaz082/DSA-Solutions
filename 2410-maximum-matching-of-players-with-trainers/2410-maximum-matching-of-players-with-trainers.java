class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {

        int n1 = players.length;
        int n2 = trainers.length;

        int i = 0, j = 0, count = 0;

        Arrays.sort(players);
        Arrays.sort(trainers);

        while (i < n1 && j < n2) {

            if (players[i] <= trainers[j]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }

        return count;
    }
}