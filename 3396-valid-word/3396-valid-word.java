class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        int vowels = 0, consonant = 0, digit = 0;
        for(char ch : word.toCharArray()){
            if(Character.isDigit(ch)){
                continue;
            }else if(Character.isLetter(ch)){
                ch = Character.toLowerCase(ch);
                switch(ch){
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    vowels++;
                    break;
                    default: 
                    consonant++;
                }
            }else return false;
        }
        System.out.println(digit+" "+vowels+" "+consonant);
        return (vowels>=1 && consonant>=1);
    }
}