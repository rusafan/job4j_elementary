package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        Point c = new Point(0, 0);
        Point d = new Point(2, 0);
        double output = c.distance(d);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when10to44then5() {
        double expected = 5;
        Point e = new Point(1, 0);
        Point f = new Point(4, 4);
        double output = e.distance(f);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when4Minus2to1Minus5then4Dot24() {
        double expected = 4.24f;
        Point g = new Point(4, -2);
        Point h = new Point(1, -5);
        double output = g.distance(h);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}