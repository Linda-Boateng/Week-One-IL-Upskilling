package AdvanceDataStructures.Tree.Trie;

import java.util.List;

public class AutoComplete {
    public static void main(String[] args) {
        Trie trie = new Trie();

        // Insert words into the trie
        String[] words = {"apple", "application", "approve", "book", "basket", "ball", "cat", "car"};
        for (String word : words) {
            trie.insert(word);
        }

        String prefix = "ba";
        List<String> matches = trie.searchPrefix(prefix);

        System.out.println("Words starting with '" + prefix + "':");
        for (String word : matches) {
            System.out.println(word);
        }
    }
}
