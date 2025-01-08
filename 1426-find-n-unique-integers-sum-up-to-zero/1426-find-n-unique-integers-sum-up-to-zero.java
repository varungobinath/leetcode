class Solution {
    public int[] sumZero(int n) {
        if(n<2) return new int[]{0};
        int[] arr = new int[n];
        int ind = 0;
        for(int i=1;i<=n/2;i++){
            arr[ind++] = i;
            arr[ind++] = -i;
        }
        if(n%2==1) arr[n-1] = 0;
        return arr;
    }
}