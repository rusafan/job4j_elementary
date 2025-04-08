package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class EqualLastTest {
    @Test
    public void whenEqual() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotEqual() {
        int[] left = {1, 2, 3};
        int[] right = {3, 3, 4};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isFalse();
    }

    @Test
    public void whenEqualV2() {
        int[] left = {1, 9};
        int[] right = {7, 8, 9};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isTrue();
    }

    @Test
    public void whenEqualV3() {
        int[] left = {9, 4, 2025};
        int[] right = {9, 2025};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isTrue();
    }
}