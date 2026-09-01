class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int[] ans = new int[k];
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> {
                if(a[0] != b[0]){
                    return a[0] - b[0];
                }
                return a[1] - b[1];
            }
        );

        for(int i = 0; i < m; i++){
            int solder = 0;
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1){
                    solder++;
                }              
            }
            pq.offer(new int[]{solder, i});
        }

        for(int i = 0; i < k; i++){
            ans[i] = pq.poll()[1];
        }

        return ans;
    }
}