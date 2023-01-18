package org.example.task2;

import org.example.task1.BubbleSort;
import org.example.task2.BalancedWordsCounter;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BalancedWordsCounterTest {
    @Test
    void test1() {
        var bwc = new BalancedWordsCounter();
        String input = "aabbabcccba";

        Integer result = 28;
        assertEquals(bwc.count(input), result);
    }

    @Test
    void test2() {
        var bwc = new BalancedWordsCounter();
        String input = "";

        Integer result = 0;

        assertEquals(bwc.count(input), result);
    }

    @Test
    void test3() {
        var bwc = new BalancedWordsCounter();
        String input = "abababa1";

        assertThrows(RuntimeException.class, () -> {
            bwc.count(input);
        });
    }

    @Test
    void test4() {
        var bwc = new BalancedWordsCounter();
        String input = null;

        assertThrows(RuntimeException.class, () -> {
            bwc.count(input);
        });
    }
}