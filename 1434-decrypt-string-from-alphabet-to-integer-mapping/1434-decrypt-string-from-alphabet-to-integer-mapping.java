class Solution {
    public String freqAlphabets(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        for(int i=n-1;i>=0;i--){
            char ch = s.charAt(i);
            if(ch=='#'){
                int pos = (s.charAt(i-2)-'0')*10+(s.charAt(i-1)-'0');
                ans.insert(0,(char)('a'+pos-1));
                i-=2;
            }else{
                char alp = (char)('a'+ch-'1');
                ans.insert(0,alp);
            }
        }
        return String.valueOf(ans);
    }
}