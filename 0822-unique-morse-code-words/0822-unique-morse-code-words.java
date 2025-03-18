class Solution {
    static String[] patterns = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for(String word : words){
            set.add(decrypt(word));
        }
        return set.size();
    }
    public String decrypt(String word){
        StringBuilder s = new StringBuilder();
        for(char ch : word.toCharArray()){
            s.append(patterns[ch-'a']);
        }
        return s.toString();
    }
}