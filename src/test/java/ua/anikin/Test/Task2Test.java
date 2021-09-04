package ua.anikin.Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task2Test {

    @Test
    void testRightStep() {
        assertTrue(Task2.isRightStep('d', 4, 'c', 6));
        assertTrue(Task2.isRightStep('d', 4, 'b', 5));
        assertTrue(Task2.isRightStep('d', 4, 'b', 3));
        assertTrue(Task2.isRightStep('d', 4, 'c', 2));
        assertTrue(Task2.isRightStep('d', 4, 'e', 2));
        assertTrue(Task2.isRightStep('d', 4, 'f', 3));
        assertTrue(Task2.isRightStep('d', 4, 'f', 5));
        assertTrue(Task2.isRightStep('d', 4, 'e', 6));
    }

    @Test
    void testLeavingTheField() {
        assertFalse(Task2.isRightStep('d', 4, 'z', 6));
        assertFalse(Task2.isRightStep('d', 4, 'C', 12));
        assertFalse(Task2.isRightStep('Z', 4, 'c', 6));
        assertFalse(Task2.isRightStep('d', -1, 'c', 6));
    }

    @Test
    void testNumberInsteadOfLater() {
        assertFalse(Task2.isRightStep('4', 4, 'c', 6));
        assertFalse(Task2.isRightStep('d', 4, '4', 6));
    }
}