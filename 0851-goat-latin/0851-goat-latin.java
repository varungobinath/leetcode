class Solution {
    public String toGoatLatin(String sentence) {
        String ans = "";
        String a = "ma";
        for(String word : sentence.trim().split(" ")){
            if(!isVowel(word.charAt(0))){
                word = word.substring(1)+word.substring(0,1);
            }
            a += "a";
            word += a;
            ans += word+" ";
        }
        return ans.substring(0,ans.length()-1);
    }
    public boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'u':
            case 'o':
            return true;
        }
        return false;
    }
}