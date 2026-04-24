package org.example;

import java.util.HashMap;
import java.util.Map;

public class MovePlaces {

    public Map<String, Integer> movePlaces(Map<Integer, String> moveMap) {
        Map<String, Integer> res = new HashMap<>();
        for (Map.Entry<Integer, String> entry : moveMap.entrySet()) {
            res.put(entry.getValue(), entry.getKey());
        }
        return res;
    }
}
