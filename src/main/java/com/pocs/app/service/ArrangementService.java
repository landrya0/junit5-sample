package com.pocs.app.service;

import com.pocs.app.domain.Box;
import com.pocs.app.domain.Item;
import com.pocs.app.util.ItemDeserializer;

import java.util.ArrayList;
import java.util.List;

public class ArrangementService {

    public List<Box> arrange(String itemSequence) {
        List<Box> boxList = new ArrayList<>();
        List<Item> itemList = ItemDeserializer.deserialize(itemSequence);

        Box currentBox = new Box();

        for (Item item : itemList) {
            boolean itemAdded = currentBox.addItem(item);
            if (!itemAdded) {
                boxList.add(currentBox);
                currentBox = new Box();
                currentBox.addItem(item);
            }
        }
        return boxList;
    }

}
