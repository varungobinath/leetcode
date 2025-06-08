class Trie {
    static class TrieNode{
        HashMap<Character,TrieNode> children;
        boolean isEndOfWord;
        TrieNode(){
            children = new HashMap<>();
            isEndOfWord = false;
        }
    }
    private TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode node = root;
        for(char ch : word.toCharArray()){
            if(!node.children.containsKey(ch)){
                node.children.put(ch,new TrieNode());
            }
            node = node.children.get(ch);
        }
        node.isEndOfWord = true;
    }
    
    public boolean search(String word) {
        TrieNode node = root;
        for(char ch : word.toCharArray()){
            if(node.children.containsKey(ch)){
                node = node.children.get(ch);
            }else{
                return false;
            }
        }
        return node.isEndOfWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(char ch : prefix.toCharArray()){
            if(node.children.containsKey(ch)){
                node = node.children.get(ch);
            }else{
                return false;
            }
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */