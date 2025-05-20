class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] hash = new int[26];
        for(char ch : sentence.toCharArray()){
            hash[ch-'a']++;
        }
        for(int i : hash){
            if(i==0) return false;
        }
        return true;
    }
}