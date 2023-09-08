package com.codewithmosh.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CellConfigFactory {
    private final Map<Integer, CellConfig> configs = new HashMap<>();

    public CellConfig get(String fontFamily, int size, boolean isBold) {
        var hash = Objects.hash(fontFamily, size, isBold);

        if(!configs.containsKey(hash))
            configs.put(hash, new CellConfig(fontFamily, size, isBold));

        return configs.get(hash);
    }
}
