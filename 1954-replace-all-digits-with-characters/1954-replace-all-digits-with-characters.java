class Solution {
    public String replaceDigits(String s) {
        char[] str = s.toCharArray();
        for(int i=1;i<str.length;i+=2){
            int p = str[i]-'0';
            str[i] = shift(str[i-1],p);
        }
        return new String(str);
    }
    char shift(char ch, int p){
        return (char)(ch+p);
    }
}