class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] str = s.toCharArray();
            Arrays.sort(str);
            String temp = new String(str);
            map.putIfAbsent(temp,new ArrayList<>());
            map.get(temp).add(s);
        }
        return new ArrayList<>(map.values());
    }
}