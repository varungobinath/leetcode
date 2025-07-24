class Solution {
    public int maximumPossibleSize(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i : nums){
            if(stack.peek()<=i){
                stack.push(i);
            }
        }
        return stack.size()-1;
    }
}