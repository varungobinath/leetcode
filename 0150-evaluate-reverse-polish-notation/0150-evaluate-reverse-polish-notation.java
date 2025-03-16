class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String str : tokens){
            if(isOperation(str)){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(calculate(a,b,str));
            }else{
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }
    public int calculate(int a,int b,String ch){
        switch(ch){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return a/b;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
    public boolean isOperation(String ch){
        return (ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/"));
    }
}