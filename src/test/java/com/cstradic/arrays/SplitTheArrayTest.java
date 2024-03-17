package com.cstradic.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitTheArrayTest {

    @Test
    void isPossibleToSplit() {
        int[] arr1 = new int[]{1,1,2,2,3,4};
        int[] arr2 = new int[]{1,1,1,1};

        var obj = new SplitTheArray();
        assertTrue(obj.isPossibleToSplit(arr1));
        assertFalse(obj.isPossibleToSplit(arr2));
    }
}