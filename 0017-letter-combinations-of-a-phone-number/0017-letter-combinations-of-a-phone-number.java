class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<>();
        String[] keyboard = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ans = new ArrayList<>();
        backtracking(ans,keyboard,digits,"",0);
        return ans;
    }

    private void backtracking(List<String> ans,String[] keyboard,String digits,String current,int index){
        if(index==digits.length()){
            ans.add(current);
            return;
        }
        String letters = keyboard[digits.charAt(index)-'0'];
        for(char letter : letters.toCharArray()){
            backtracking(ans,keyboard,digits,current+letter,index+1);
        }
    }
}