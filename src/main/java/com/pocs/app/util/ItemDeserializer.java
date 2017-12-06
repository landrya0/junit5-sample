package com.pocs.app.util;

import com.pocs.app.domain.Item;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by landry on 06/12/17.
 */
public class ItemDeserializer {

    public static List<Item> deserialize(String itemSequence) {
        return itemSequence.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .map(Integer::parseInt)
                .map(Item::new)
                .collect(Collectors.toList());
    }
}
