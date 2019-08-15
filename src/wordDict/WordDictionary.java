package wordDict;

import java.util.HashMap;

public class WordDictionary {

    private HashMap<String, String> dict = new HashMap<>();

    public void addWord(String t1, String t2) {
        dict.put(t1.toLowerCase(), t2);
    }

    public String find(String text) {
        String temp = text.toLowerCase();

        return dict.get(temp);
    }
}