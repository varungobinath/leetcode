class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        int nd = numsDivide.length;
        int result = numsDivide[0];
        for(int i=1;i<nd;i++){
            result = gcd(numsDivide[i],result);
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length && nums[i]<=result;i++){
            if(result%nums[i]==0) return i;
        }
        return -1;

    }
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}