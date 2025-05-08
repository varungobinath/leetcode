class Solution {
    static String vowels = "aeiouAEIOU";
    public boolean halvesAreAlike(String s) {
        int n = s.length()/2;
        int count = 0;
        for(int i=0;i<n;i++){
            if(isvowels(s.charAt(i))) count++;
            if(isvowels(s.charAt((n)+i))) count--;
        }
        return count==0;
    }
    public boolean isvowels(char ch){
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }
}