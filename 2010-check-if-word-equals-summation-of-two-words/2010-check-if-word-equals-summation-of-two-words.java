class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return convertToInt(firstWord)+convertToInt(secondWord)==convertToInt(targetWord);
    }
    private int convertToInt(String word){
        int n = 0;
        for(char ch : word.toCharArray()){
            n = n*10+(ch-'a');
        }
        return n;
    }
}