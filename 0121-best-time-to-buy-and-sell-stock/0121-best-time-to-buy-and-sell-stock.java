class Solution {
    public int maxProfit(int[] prices) {
        int max_pro = 0;
        int n = prices.length;
        int min_pro = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
                min_pro=Math.min(min_pro,prices[i]);
            int pro = prices[i]-min_pro;
            max_pro = Math.max(max_pro,pro);
        }
        return max_pro;
    }
}