class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i] = countBitN(i);
        }
        return ans;
    }
    private int countBitN(int n){
        int count = 0;
        while(n>0){
            count += n%2;
            n/=2;
        }
        return count;
    }
}