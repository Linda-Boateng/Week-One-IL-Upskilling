package AdvanceDataStructures.Tree.Trie;

import java.util.ArrayList;
import java.util.List;

public class Trie {
    private final TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            if (node.getChild(c) == null) {
                node.setChild(c);
            }
            node = node.getChild(c);
        }
        node.setWord(true);
    }

    public List<String> searchPrefix(String prefix) {
        List<String> result = new ArrayList<>();
        TrieNode node = root;
        for (char c : prefix.toCharArray()) {
            if (node.getChild(c) == null) {
                return result;
            }
            node = node.getChild(c);
        }
        retrieveWords(node, prefix, result);
        return result;
    }

    private void retrieveWords(TrieNode node, String currentWord, List<String> result) {
        if (node.isWord()) {
            result.add(currentWord);
        }
        for (char c = 'a'; c <= 'z'; c++) {
            TrieNode child = node.getChild(c);
            if (child != null) {
                retrieveWords(child, currentWord + c, result);
            }
        }
    }
}
