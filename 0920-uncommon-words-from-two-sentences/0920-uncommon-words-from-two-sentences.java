class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] l1 = s1.trim().split("\\s+");
        String[] l2 = s2.trim().split("\\s+");
        HashMap<String,Integer> hash = new HashMap<>();
        for(String word : l1){
            hash.put(word,hash.getOrDefault(word,0)+1);
        }
        for(String word : l2){
            hash.put(word,hash.getOrDefault(word,0)+1);
        }
        List<String> ans = new ArrayList<>();
        for(String word : hash.keySet()){
            if(hash.get(word)==1){
                ans.add(word);
            }
        }
        return ans.toArray(new String[0]);
    }
}