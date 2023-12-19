package com.cstradic.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    @DisplayName("Contains Duplicate Solution Test")
    void containsDuplicate() {
        int[] inpExp1 = new int[]{1,2,3,1};
        int[] inpExp2 = new int[]{1,2,3,4};
        int[] inpExp3 = new int[]{1,1,1,3,3,4,3,2,4,2};

        ContainsDuplicate obj = new ContainsDuplicate();

        assertTrue(obj.containsDuplicate(inpExp1));
        assertFalse(obj.containsDuplicate(inpExp2));
        assertTrue(obj.containsDuplicate(inpExp3));
    }
}