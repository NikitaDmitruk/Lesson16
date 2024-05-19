package TaskTwo;

import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String[] wordArray = {"moon", "banana", "sugar", "rice", "car", "plane"};
        TreeMap<String, String> pairOfLetters = new TreeMap<>();
        for (String word : wordArray) {
            char[] letter = word.toCharArray();
            pairOfLetters.put((String.valueOf(letter[0])), String.valueOf(letter[letter.length - 1]));
        }
        System.out.println(pairOfLetters.toString().replace("=", ":"));
    }
}