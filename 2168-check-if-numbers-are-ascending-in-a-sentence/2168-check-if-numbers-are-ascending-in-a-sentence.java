class Solution {
    public boolean areNumbersAscending(String s) {
        int temp = -1;
        int cur = 0;
        boolean flag = false;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                cur = cur*10+(ch-'0');
                flag = true;
            }else if(!Character.isDigit(ch) && flag){
                flag = false;
                if(temp>=cur) return false;
                temp = cur;
                cur = 0;
            }
        }
        if(flag) return temp<cur;
        return true;
    }
}