package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoNumberSumTest {
    @Test
    void whenTwoEqualsNumbersYesTarget() {
        int[] array = {5, 5};
        int target = 10;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {0, 1};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenTwoEqualsNumbersNoTarget() {
        int[] array = {5, 5};
        int target = 12;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenWithNegativeNumbersYesTarget() {
        int[] array = {-7, -5, 0, 5, 8, 12};
        int target = 3;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {1, 4};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenWithoutNegativeNumbersYesTarget() {
        int[] array = {0, 2, 5, 8, 10, 12};
        int target = 15;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {2, 4};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when10and12NumbersYesTarget() {
        int[] array = {0, 2, 5, 8, 10, 12};
        int target = 22;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {4, 5};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when0and12NumbersYesTarget() {
        int[] array = {0, 2, 5, 8, 10, 12};
        int target = 12;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {0, 5};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2and7NumbersYesTarget() {
        int[] array = {2, 5, 7, 11};
        int target = 9;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {0, 2};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNoNumbersNoTarget() {
        int[] array = {-3, 3, 6, 13};
        int target = 11;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when6and13NumbersNoTarget() {
        int[] array = {-3, 3, 6, 13};
        int target = 19;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {2, 3};
        assertThat(result).isEqualTo(expected);
    }
}