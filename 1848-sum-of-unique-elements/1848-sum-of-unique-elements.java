class Solution {
    public int sumOfUnique(int[] nums) {
        int[] hash = new int[101];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;
        }
        int sum = 0;
        for(int i=0;i<101;i++){
            if(hash[i]==1) sum+=i;
        }
        return sum;
    }
}