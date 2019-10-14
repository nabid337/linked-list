package trie;

public class Trie {
    private TrieNode root;

    Trie() {
        root = new TrieNode();
    }

    public void insert(String word){
        TrieNode current = root;
        for(int i=0; i<word.length(); i++){
            current = current.getChildren()
                    .computeIfAbsent(word.charAt(i), character -> new TrieNode());

        }
       current.setEndOfWord(true);
    }
}
