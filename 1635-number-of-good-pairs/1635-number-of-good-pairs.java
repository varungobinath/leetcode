class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        HashMap<Integer,List<Integer>> hash = new HashMap<>();
        for(int idx=0;idx<nums.length;idx++){
            int num = nums[idx];
            if(!hash.containsKey(num)){
                hash.put(num,new ArrayList<>());
                hash.get(num).add(idx);
            }else{
                count+=hash.get(num).size();
                hash.get(num).add(idx);
            }
        }
        return count;
    }
}