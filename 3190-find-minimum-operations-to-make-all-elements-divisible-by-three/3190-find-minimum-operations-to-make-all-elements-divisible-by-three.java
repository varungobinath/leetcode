class Solution {
    public int minimumOperations(int[] nums) {
        int min_ope = 0;
        for(int i : nums){
            if(i%3!=0) min_ope++;
        }
        return min_ope;
    }
}