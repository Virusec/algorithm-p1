package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class StringListImplTest {
    private final StringListImpl test = new StringListImpl();

    @BeforeEach
    public void setUp() {
        test.add("Milk");
        test.add("Eggs");
        test.add("Bread");
    }

    @Test
    void add() {
        assertEquals(test.add("Milk"), "Milk");
    }

    @Test
    void AddIS() {
        assertEquals(test.add(1, "Eggs"), "Eggs");
    }

    @Test
    void set() {
        assertEquals(test.set(2, "Onion"), "Onion");
    }

    @Test
    void removeStr() {
        assertEquals(test.remove("Eggs"), "Eggs");
    }

    @Test
    void RemoveInd() {
        assertEquals(test.remove(0), "Milk");
    }

    @Test
    void containsTrue() {
        assertTrue(test.contains("Eggs"));
    }

    @Test
    void containsFalse() {
        assertFalse(test.contains("Tomato"));
    }

    @Test
    void indexOf() {
        assertEquals(test.indexOf("Eggs"), 1);
    }

    @Test
    void lastIndexOf() {
        assertEquals(test.lastIndexOf("Milk"), 0);
    }

    @Test
    void get() {
        assertEquals(test.get(0), "Milk");
    }

    @Test
    void equalsTrue() {
        StringListImpl test2 = new StringListImpl();
        test2.add("Milk");
        test2.add("Eggs");
        test2.add("Bread");
        assertTrue(Arrays.equals(test.toArray(), test2.toArray()));
    }

    @Test
    void equalsFalse() {
        StringListImpl test2 = new StringListImpl();
        test2.add("Milk");
        test2.add("Eggs");
        assertFalse(Arrays.equals(test.toArray(), test2.toArray()));
    }

    @Test
    void size() {
        assertEquals(test.size(), 3);
    }

    @Test
    void isEmptyFalse() {
        assertFalse(test.isEmpty());
    }

    @Test
    void isEmptyTrue() {
        StringListImpl test3 = new StringListImpl();
        assertTrue(test3.isEmpty());
    }

    @Test
    void clear() {
        test.clear();
        assertEquals(0, test.size());
    }

    @Test
    void toArray() {
        StringListImpl test4 = new StringListImpl();
        test4.add("Milk");
        test4.add("Eggs");
        test4.add("Bread");
        assertArrayEquals(test4.toArray(), test.toArray());
    }
}