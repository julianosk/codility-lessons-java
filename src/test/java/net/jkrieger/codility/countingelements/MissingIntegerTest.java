package net.jkrieger.codility.countingelements;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingIntegerTest {

    MissingInteger s = new MissingInteger();

    @Test
    public void test_0() {
        int[] a = {1, 3, 6, 4, 1, 2};
        assertEquals(5, s.solution(a));
    }

    @Test
    public void test_1() {
        int[] a = {1, 2, 3};
        assertEquals(4, s.solution(a));
    }

    @Test
    public void test_2() {
        int[] a = {-1, -3};
        assertEquals(1, s.solution(a));
    }

    @Test
    public void test_3() {
        int[] a = {-1, 1000};
        assertEquals(1, s.solution(a));
    }

    @Test
    public void test_4() {
        int[] a = {-1, 1, 1000};
        assertEquals(2, s.solution(a));
    }


}
