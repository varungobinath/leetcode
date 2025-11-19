class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i : nums) hash.add(i);
        while(hash.contains(original)){
            original*=2;
        }
        return original;
    }
}