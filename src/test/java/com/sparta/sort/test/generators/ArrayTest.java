package com.sparta.sort.test.generators;

import com.sparta.sort.model.generator.ArrayGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ArrayTest {
    @DisplayName("Empty Array generation")
    @Test
    public void testEmptyArray() {
        int[] expected = {};
        int[] actual = ArrayGenerator.generate(0);
        assertArrayEquals(expected, actual);
    }

    @DisplayName("Test negative input")
    @Test
    public void testNegativeInput() {
        int[] array = ArrayGenerator.generate(-5);
        assertNull(array);
    }

    @DisplayName("Array length")
    @Test
    public void testArrayLength() {
        int[] array = ArrayGenerator.generate(10);
        assertEquals(10, array.length);
    }
}
