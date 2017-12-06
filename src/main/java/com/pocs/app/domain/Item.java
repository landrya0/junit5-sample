package com.pocs.app.domain;

/**
 * Created by landry on 06/12/17.
 */
public class Item {

    private final int size;

    public Item(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Item{" +
                "size=" + size +
                '}';
    }
}
