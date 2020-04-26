package net.jkrieger.codility.timecomplexity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PermMissingElemTest {

    PermMissingElem s = new PermMissingElem();

    @Test
    public void test_0() {
        int[] a = {2, 3, 1, 5};
        assertEquals(4, s.solution(a));
    }

    @Test
    public void test_1() {
        int[] a = {1, 3};
        assertEquals(2, s.solution(a));
    }

    @Test
    public void test_2() {
        int[] a = {1, 2};
        assertEquals(3, s.solution(a));
    }

    @Test
    public void test_3() {
        int[] a = {1};
        assertEquals(2, s.solution(a));
    }

    @Test
    public void test_4() {
        int[] a = {};
        assertEquals(1, s.solution(a));
    }

    @Test
    public void test_5() {
        int[] a = {2};
        assertEquals(1, s.solution(a));
    }
}
