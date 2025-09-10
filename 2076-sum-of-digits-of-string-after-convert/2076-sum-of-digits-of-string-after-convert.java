class Solution {
    public int getLucky(String s, int k) {
        StringBuilder str = new StringBuilder();
        for(char ch : s.toCharArray()){
            int pos = ch-'a'+1;
            str.append(pos);
        }
        String schar = String.valueOf(str);
        while(k-->0){
            schar = func(schar);
        }
        return Integer.parseInt(schar);
    }
    public String func(String schar){
        long sum = 0;
        for(char ch : schar.toCharArray()){
            sum += (long)(ch-'0');
        }
        return String.valueOf(sum);
    }
}