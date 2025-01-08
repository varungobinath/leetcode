class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int n = s.length();
        int i = 0;
        while(i<n){
            while(i<n && s.charAt(i)==' ') i++;
            if(i>=n) break;
            int j = i+1;
            while(j<n && s.charAt(j)!=' ') j++;
            String sub = s.substring(i,j);
            if(result.isEmpty()) result.append(sub);
            else{
                result.insert(0," ");
                result.insert(0,sub);
            }
            i = j+1;
        }
        return String.valueOf(result);
    }
}