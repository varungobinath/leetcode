class Solution {
    public int arraySign(int[] nums) {
        int count_neg = 1;
        for(int i : nums){
            if(i==0) return 0;
            if(i<0) count_neg = -1 * count_neg;
        }
        return count_neg;
    }
}