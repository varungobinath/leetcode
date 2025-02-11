class Solution {
    public String removeOccurrences(String s, String part) {
        int ind = 0;
        int plength = part.length();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            sb.append(ch);
            ind++;
            if(String.valueOf(sb).contains(part)){
                sb.delete(ind-plength,ind);
                ind-=part.length();
            }
        }
        return String.valueOf(sb);
    }
}