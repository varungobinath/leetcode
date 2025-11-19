class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int[] hash = new int[nums.length+1];
        for(int num : nums){
            hash[num]++;
        }
        for(int i=1;i<=nums.length;i++){
            if(hash[i]==2) ans[0] = i;
            else if(hash[i]==0) ans[1] = i;
        }
        return ans;
    }
}