class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int sum = 0;
            if(k>0){
                for(int j=i+1;j<=i+k;j++){
                    ans[i] += code[j%n];
                }
            }else{
                for(int j=i+1;j<=i+(-k);j++){
                    ans[n-i-1] += code[n-(j%n)-1];
                }
            }
        }
        return ans;
    }
}