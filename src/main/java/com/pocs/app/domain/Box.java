package com.pocs.app.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Box {

    private static final int MAX_CAPACITY = 10;
    private List<Item> itemList = new ArrayList<>();

    public boolean addItem(Item item) {
        if (getCapacity() - item.getSize() >= 0) {
            itemList.add(item);
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return getCapacity() == MAX_CAPACITY;
    }

    public int getCapacity() {
        return MAX_CAPACITY - itemList.stream()
                .mapToInt(Item::getSize)
                .reduce((a, b) -> a + b)
                .orElse(0);
    }

    @Override
    public String toString() {
        return itemList.stream().map(Item::toString).collect(Collectors.joining(""));
    }
}
