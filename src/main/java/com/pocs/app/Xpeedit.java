package com.pocs.app;

import com.pocs.app.domain.Box;
import com.pocs.app.service.BasicArrangementService;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public class Xpeedit {
    public static void main(String[] args) {

        BasicArrangementService service = new BasicArrangementService();

        List<Box> boxes = service.arrange("163841689525773");

        String boxesSequence = boxes.stream().map(Box::toString).collect(Collectors.joining("/"));

        System.out.println(boxesSequence);

    }
}
