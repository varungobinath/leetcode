class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] ans = {-1,-1};
        int lastPrime = 1;
        int min = Integer.MAX_VALUE;
        for(int i=Math.max(2,left);i<=right;i++){
            if(isprime(i)){
                if(lastPrime==1){
                    lastPrime = i;
                    continue;
                }
                int currmin = i-lastPrime;
                if(currmin<min){
                    min = currmin;
                    ans[0] = lastPrime;
                    ans[1] = i;
                }
                lastPrime = i;
            }
        }
        return ans;
        
    }
    public boolean isprime(int n){
        // if(n==1) return false;
        // for(int i=2;i<=Math.sqrt(n);i++){
        //     if(n%i==0){
        //         return false;
        //     }
        // }
        // return true;
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}