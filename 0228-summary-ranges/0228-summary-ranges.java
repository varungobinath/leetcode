class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> lst = new ArrayList<>();
        for(int i=0;i<nums.length;){
            int start = nums[i];
            int j = i;
            while(j<nums.length-1 && nums[j]+1==nums[j+1]){
                j++;
            }
            if(nums[j]==start){
                lst.add(String.valueOf(start));
            }else{
                lst.add(start+"->"+nums[j]);
            }
            i = j+1;
        }
        return lst;
    }
}