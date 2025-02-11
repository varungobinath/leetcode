class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        int ind = -1;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                sb.deleteCharAt(ind);
                ind--;
            }else{
                sb.append(ch);
                ind++;
            }
        }
        return String.valueOf(sb);
    }
}