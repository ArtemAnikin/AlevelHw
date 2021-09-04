package ua.anikin.hw5;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task2Test {

    @Test
    void testSameNumbers() {
        assertTrue(Task2.isOrderedArray(new int[]{0, 0, 0, 0, 0}));
        assertTrue(Task2.isOrderedArray(new int[]{1, 1, 1, 1, 1}));
        assertTrue(Task2.isOrderedArray(new int[]{-1, -1, -1, -1, -1}));
    }

    @Test
    void testCorrectWork() {
        assertTrue(Task2.isOrderedArray(new int[]{5, 4, 3, 2, 1}));
        assertFalse(Task2.isOrderedArray(new int[]{0, 5, 4, 3, 2, 1}));
    }

    @Test
    void testEmptyArray(){
        assertTrue(Task2.isOrderedArray(new int[3]));
    }
}