package net.jkrieger.arrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CyclicRotationTest {

    CyclicRotation s = new CyclicRotation();
    @Test
    public void test_0() {
        int[] a = {0, 1, 2, 3};
        assertArrayEquals(a, s.solution(a, 0));
    }

    @Test
    public void test_1() {
        int[] a = {0, 1, 2, 3};
        int[] solution = {3, 0, 1, 2};
        assertArrayEquals(solution, s.solution(a, 1));
    }

    @Test
    public void test_2() {
        int[] a = {0, 1, 2, 3};
        int[] solution = {2, 3, 0, 1};
        assertArrayEquals(solution, s.solution(a, 2));
    }

    @Test
    public void test_3() {
        int[] a = {0, 1, 2, 3};
        int[] solution = {1, 2, 3, 0};
        assertArrayEquals(solution, s.solution(a, 3));
    }

    @Test
    public void test_4() {
        int[] a = {0, 1, 2, 3};
        int[] solution = {0, 1, 2, 3};
        assertArrayEquals(solution, s.solution(a, 4));
    }

    @Test
    public void test_4_one_element() {
        int[] a = {0};
        assertArrayEquals(a, s.solution(a, 4));
    }

    @Test
    public void test_4_empty_array() {
        int[] a = {};
        assertArrayEquals(a, s.solution(a, 4));
    }

}
