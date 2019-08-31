package com;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstMavenTest {
    @Test
   void testPrintResultProduct() {
        FirstMaven.printResultProduct(4);
    }

    @Test
    void testResultProduct() {
        assertEquals(4, FirstMaven.product(2, 2));
    }

    @Test
    void testResultProductNull() {

    }
}
