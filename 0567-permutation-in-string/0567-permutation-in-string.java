class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;

        int[] s1map = new int[26];
        int[] s2map = new int[26];

        //initializing sliding window of first s1's length of both map
        for(int i=0;i<s1.length();i++){
            s1map[s1.charAt(i)-'a']++;
            s2map[s2.charAt(i)-'a']++;
        }

        //sliding starts
        int l = 0;
        for(int r=s1.length();r<s2.length();r++){
            if(Arrays.equals(s1map,s2map)) return true;
            s2map[s2.charAt(r)-'a']++;
            s2map[s2.charAt(l)-'a']--;
            l++;
        }
        return Arrays.equals(s1map,s2map);
    }
}