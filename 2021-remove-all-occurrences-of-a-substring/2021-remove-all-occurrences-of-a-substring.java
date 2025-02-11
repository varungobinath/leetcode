class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        int plength = part.length();
        while(sb.indexOf(part)!=-1){
            int ind = sb.indexOf(part);
            sb.delete(ind,ind+plength);
        }
        return String.valueOf(sb);
    }
}