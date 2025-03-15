class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(stack.isEmpty() || ch!=stack.peek()){
                stack.push(ch);
            }else{
                stack.pop();
            }
        }
        StringBuilder str = new StringBuilder();
        for(char ch : stack){
            str.append(ch);
        }
        return str.toString();
    }
}