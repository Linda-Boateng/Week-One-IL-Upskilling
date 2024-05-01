package AdvanceDataStructures.Tree.Trie;

public class TrieNode {
    private TrieNode[] children;
    private boolean isWord;

    public TrieNode() {
        this.children = new TrieNode[26]; // Assuming only lowercase English letters
        this.isWord = false;
    }

    public TrieNode getChild(char c) {
        return children[c - 'a'];
    }

    public void setChild(char c) {
        children[c - 'a'] = new TrieNode();
    }

    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean word) {
        isWord = word;
    }
}
