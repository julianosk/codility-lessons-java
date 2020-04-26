package net.jkrieger.codility.prefixsums;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountDivElemTest {

    CountDivElem s = new CountDivElem();

    @Test
    public void test_0() {
        assertEquals(3, s.solution(6, 11, 2));
    }

    @Test
    public void test_1() {
        assertEquals(2, s.solution(6, 11, 3));
    }

    @Test
    public void test_2() {
        assertEquals(6, s.solution(6, 11, 1));
    }

    @Test
    public void test_3() {
        assertEquals(0, s.solution(6, 6, 7));
    }

    @Test
    public void test_4() {
        assertEquals(1, s.solution(6, 6, 6));
    }
}
