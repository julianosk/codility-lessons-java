package net.jkrieger.timecomplexity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrogJmpTest {

    FrogJmp s = new FrogJmp();

    @Test
    public void test_0() {
        assertEquals(3, s.solution(10, 85, 30));
    }

    @Test
    public void test_1() {
        assertEquals(0, s.solution(10, 10, 5));
    }

    @Test
    public void test_2() {
        assertEquals(1, s.solution(10, 20, 30));
    }

    @Test
    public void test_3() {
        assertEquals(2, s.solution(10, 20, 5));
    }

    @Test
    public void test_4() {
        assertEquals(3, s.solution(10, 21, 5));
    }
}
