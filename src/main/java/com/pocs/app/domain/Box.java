package com.pocs.app.domain;

import java.util.ArrayList;
import java.util.List;

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

    public boolean isFull() {
        return getCapacity() == 0;
    }

    public int getCapacity() {
        return MAX_CAPACITY - itemList.stream()
                .mapToInt(Item::getSize)
                .reduce((a, b) -> a + b)
                .orElse(0);
    }

    @Override
    public String toString() {
        return "Box{" +
                ", itemList=" + itemList +
                '}';
    }
}
