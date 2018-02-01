package com.pocs.app;

import com.pocs.app.domain.Box;
import com.pocs.app.service.BasicArrangementService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

/**
 * Unit test for simple Xpeedit.
 */
public class XpeeditTest {

    private BasicArrangementService basicArrangementService = new BasicArrangementService();

    @Test
    public void should_use_zero_box_when_item_sequence_is_empty() {

        List<Box> arrange = basicArrangementService.arrange("");

        Assertions.assertEquals(0, arrange.size());
    }
}
