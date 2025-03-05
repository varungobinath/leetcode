class Solution {
    public String getEncryptedString(String s, int k) {
        char[] str = s.toCharArray();
        k%=str.length;
        reverse(str,k,str.length-1);
        reverse(str,0,k-1);
        reverse(str,0,str.length-1);
        return new String(str);
    }
    public char[] reverse(char[] str,int l,int r){
        while(l<r){
            char temp = str[l];
            str[l] = str[r];
            str[r] = temp;
            l++;
            r--;
        }
        return str;
    }
}