class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max_num = 0;
        int max_frequency = 0;
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)>max_frequency){
                max_frequency = map.get(i);
                max_num = i;
            }
        }
        return max_num;
    }
}