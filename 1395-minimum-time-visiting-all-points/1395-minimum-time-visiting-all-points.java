class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n = points.length;
        int count = 0;
        for(int i=0;i<n-1;i++){
            int[] p1 = points[i];
            int[] p2 = points[i+1];
            count += Math.max(Math.abs(p1[0]-p2[0]),Math.abs(p1[1]-p2[1]));
        }
        return count;
    }
}