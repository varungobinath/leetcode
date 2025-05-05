class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        List<Integer> lst = new ArrayList<>();
        for(int i=0;i<n;i++){
            lst.add(index[i],nums[i]);
        }
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = lst.get(i);
        }
        return ans;
    }
}