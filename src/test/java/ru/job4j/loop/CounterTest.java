package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import ru.job4j.loop.Counter;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {
    @Test
    void whenCounter0To5Then15() {
        int start = 0;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenCounter5To10Then45() {
        int start = 5;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 45;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenCounter5To0Then0() {
        int start = 5;
        int finish = 0;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenCounterMinus1To2Then2() {
        int start = -1;
        int finish = 2;
        int result = Counter.sum(start, finish);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenCounterMinus3ToMinus5Then0() {
        int start = -3;
        int finish = -5;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenCounter4To9Then18() {
        int start = 4;
        int finish = 9;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenCounterMinus2To4Then4() {
        int start = -2;
        int finish = 4;
        int result = Counter.sumByEven(start, finish);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}