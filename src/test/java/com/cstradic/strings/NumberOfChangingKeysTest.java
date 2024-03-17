package com.cstradic.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfChangingKeysTest {
    private NumberOfChangingKeys object;

    @BeforeEach
    void setUp() {
        object = new NumberOfChangingKeys();
    }

    @Test
    void countKeyChanges() {
        //Test case 1
        assertEquals(2,object.countKeyChanges("aAbBcC"));
        //Test case 2
        assertEquals(0, object.countKeyChanges("AaAaAaaA"));
    }
}