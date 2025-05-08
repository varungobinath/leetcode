class Solution {
    static String vowels = "aeiouAEIOU";
    public boolean halvesAreAlike(String s) {
        int n = s.length()/2;
        int count = 0;
        for(int i=0;i<n;i++){
            if(vowels.indexOf(s.charAt(i))!=-1) count++;
            if(vowels.indexOf(s.charAt((n)+i))!=-1) count--;
        }
        return count==0;
    }
}