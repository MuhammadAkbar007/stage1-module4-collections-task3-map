package com.epam.mjc.collections.map;

import java.util.Map;

public class WordRepetitionMain {
    public static void main(String[] args) {
        WordRepetitionMapCreator mapCreator = new WordRepetitionMapCreator();
        Map<String, Integer> wordRepetitionMap = mapCreator.createWordRepetitionMap("sentence in loWER caSE, SENTENCE IN UPper CAse.");
        wordRepetitionMap.forEach((key, value) -> System.out.println(key + " - " + value));
    }
}
