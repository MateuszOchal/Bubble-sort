package org.example.task1;

import org.example.task1.BubbleSort;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @Test
    void test1() {
        var bubbleSort = new BubbleSort();
        List<Comparable<?>> actual = Arrays.asList(1,4,5,6,8,3,8);

        List<Comparable<?>> expected = Arrays.asList(1,3,4,5,6,8,8);

        assertEquals(bubbleSort.sort(actual), expected);
    }

    @Test
    void test2() {
        var bubbleSort = new BubbleSort();
        List<Comparable<?>> actual = Arrays.asList(-9.3, 0.2, 4, 0.1, 5, 9);

        List<Comparable<?>> expected = Arrays.asList(-9.3, 0.1, 0.2, 4, 5, 9);

        assertEquals(bubbleSort.sort(actual), expected);
    }
    
    @Test
    void test3(){
        var bubbleSort = new BubbleSort();
        List<Comparable<?>> actual = new ArrayList<>();

        List<Comparable<?>> expected = new ArrayList<>();

        assertEquals(bubbleSort.sort(actual), expected);
    }

    @Test
    void test4(){
        var bubbleSort = new BubbleSort();
        List<Comparable<?>> actual = new ArrayList<>();
        actual.add(null);
        actual.add(5.0001);

        List<Comparable<?>> expected = new ArrayList<>();
        expected.add(5.0001);

        assertEquals(bubbleSort.sort(actual), expected);
    }

    @Test
    void test5(){
        var bubbleSort = new BubbleSort();
        List<Comparable<?>> actual = null;

         assertThrows(RuntimeException.class, () -> {
            bubbleSort.sort(actual);
        });
    }
}