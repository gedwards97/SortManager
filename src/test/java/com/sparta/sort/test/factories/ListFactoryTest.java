package com.sparta.sort.test.factories;

import com.sparta.sort.model.factory.ListFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ListFactoryTest {
    @DisplayName("Empty ArrayList generation")
    @Test
    public void testEmptyArray() {
        List expected = new ArrayList();
        List actual = ListFactory.getList(0, "strings", "array");
        assertEquals(expected, actual);
    }

    @DisplayName("Test negative length input")
    @Test
    public void testNegativeInput() {
        List list = ListFactory.getList(-5, "strings", "array");
        assertNull(list);
    }

    @DisplayName("Array length")
    @Test
    public void testArrayLength() {
        List list = ListFactory.getList(10, "strings", "array");
        assertEquals(10, list.size());
    }
}
