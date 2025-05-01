class Solution {
    public int fib(int n) {
        if(n==0 || n==1) return n;
        int[] arr = {0,1,1};
        for(int i=2;i<n;i++){
            arr[0] = arr[1];
            arr[1] = arr[2];
            arr[2] = arr[0]+arr[1];
        }
        return arr[2];
    }
}