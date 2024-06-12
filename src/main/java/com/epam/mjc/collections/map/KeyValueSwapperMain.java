package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapperMain {
    public static void main(String[] args) {
        KeyValueSwapper swapper = new KeyValueSwapper();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(10, "one");
        swapper.swap(map);
    }
}
