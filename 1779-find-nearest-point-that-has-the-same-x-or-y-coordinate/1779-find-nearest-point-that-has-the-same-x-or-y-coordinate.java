class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minDistance = Integer.MAX_VALUE;
        int ans = -1;
        int n = points.length;

        for(int i = 0; i < n; i++){
            int px = points[i][0];
            int py = points[i][1];

            if(x == px || y == py){
                int distance = Math.abs(x - px) + Math.abs(y - py);

                if(distance < minDistance){
                    minDistance = distance;
                    ans = i;
                }
            }
        }
        return ans;
    }
}