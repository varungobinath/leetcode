class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int count = n;
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!visited[j] && fruits[i]<=baskets[j]){
                    visited[j] = true;
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}