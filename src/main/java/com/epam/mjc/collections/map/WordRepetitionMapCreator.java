package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordRepetitionMap = new HashMap<>();

        if (!sentence.isEmpty()) {
            // Remove punctuation and split sentence into words
            String[] words = sentence.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");

            // Iterate array and add words to map
            for (String word : words) {
                wordRepetitionMap.put(word, wordRepetitionMap.getOrDefault(word, 0) + 1);
            }
        }
        System.out.println(wordRepetitionMap);
        return wordRepetitionMap;
    }
}
