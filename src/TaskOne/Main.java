package TaskOne;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] wordArray = {"a", "b", "b", "e", "e", "g", "c"};
        HashMap<String, Boolean> wordMultiple = new HashMap<>();
        for (String word : wordArray) {
            if (wordMultiple.get(word) == null) {
                wordMultiple.put(word, false);
            } else if (!wordMultiple.get(word)) {
                wordMultiple.put(word, true);
            }
        }
        System.out.println(wordMultiple.toString().replace("=", ":"));
    }
}

