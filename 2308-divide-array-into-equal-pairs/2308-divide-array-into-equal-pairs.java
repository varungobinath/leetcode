class Solution {
    public boolean divideArray(int[] nums) {
        int[] hash = new int[501];
        for(int i : nums){
            hash[i]++;
        }
        for(int i : hash){
            if(i%2==1) return false;
        }
        return true;
    }
}