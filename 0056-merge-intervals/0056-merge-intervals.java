class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> result = new ArrayList<>();
        int idx = -1;
        for(int[] interval : intervals){
            if(result.isEmpty() || result.get(idx)[1]<interval[0]){
                result.add(interval);
                idx++;
            }
            else{
                result.get(idx)[1] = Math.max(result.get(idx)[1],interval[1]);
            }
        }
        int[][] ans = new int[result.size()][];
        for(int i=0;i<result.size();i++){
            ans[i] = result.get(i);
        }
        return ans;
    }
}