class Solution {
    public int countAsterisks(String s) {
        String[] str = s.trim().split("\\|");
        int count = 0;
        for(int i=0;i<str.length;i+=2){
            count += count(str[i]);
        }
        return count;
    }
    public int count(String s){
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch=='*') count++;
        }
        return count;
    }
}