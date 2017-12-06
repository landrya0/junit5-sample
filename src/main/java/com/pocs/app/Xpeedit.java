package com.pocs.app;

import com.pocs.app.domain.Box;
import com.pocs.app.service.ArrangementService;

import java.util.List;

/**
 * Hello world!
 */
public class Xpeedit {
    public static void main(String[] args) {

        ArrangementService service = new ArrangementService();

        List<Box> boxes = service.arrange("33");

        System.out.println("Box Number: " + boxes.size());
        boxes.forEach(box -> {
            System.out.print("Boxe Capacity: " + box.getCapacity() + " ");
            System.out.println(box.toString());
        });

    }
}
