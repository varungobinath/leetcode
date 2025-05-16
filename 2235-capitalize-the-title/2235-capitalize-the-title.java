class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder ans = new StringBuilder();
        for(String word : title.split(" ")){
            if(word.length()<=2) ans.append(word.toLowerCase());
            else{
                ans.append(word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase());
            }
            ans.append(" ");
        }
        ans.deleteCharAt(title.length());
        return ans.toString();
    }
}