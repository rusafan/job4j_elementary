package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax5To3Then2() {
        int left = 5;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxMinus1To2Then2() {
        int left = -1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7To7Then7() {
        int left = 7;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To3To5Then5() {
        int left = 1;
        int right = 3;
        int middle = 5;
        int result = Max.max(left, right, middle);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax0To2To7To9Then9() {
        int left = 0;
        int right = 2;
        int middle = 7;
        int next = 9;
        int result = Max.max(left, right, middle, next);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }
}