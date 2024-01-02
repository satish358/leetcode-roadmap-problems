package com.cstradic.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    void isAnagram() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertTrue(validAnagram.isAnagram("anagram", "nagaram"));
        assertTrue(validAnagram.isAnagram("satish", "sshati"));
        assertFalse(validAnagram.isAnagram("rat", "car"));
    }
}