class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] s = str.toCharArray();
            Arrays.sort(s);
            String temp = new String(s);
            map.putIfAbsent(temp,new ArrayList<>());
            map.get(temp).add(str);
        }
        return new ArrayList<>(map.values());
    }
}