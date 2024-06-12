package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> resultMap = new HashMap<>();

        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            if (resultMap.containsKey(value)) {
                Integer oldValue = resultMap.get(value);
                if (key < oldValue) resultMap.put(value, key);
            } else {
                resultMap.put(value, key);
            }
        }

        System.out.println(resultMap);
        return resultMap;
    }
}
