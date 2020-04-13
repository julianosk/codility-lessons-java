package net.jkrieger.arrays;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OddOccurrencesInArrayTest {

    OddOccurrencesInArray s = new OddOccurrencesInArray();

    @Test
    public void test_0() {
        int[] a = {1, 2, 1, 2, 3};
        assertEquals(s.solution(a), 3);
    }

    @Test
    public void test_1() {
        int[] a = {0, 1, 2, 3, 0, 1, 2};
        assertEquals(s.solution(a), 3);
    }

    @Test
    public void test_3() {
        int[] a = {9,3,9,3,9,7,9};
        assertEquals(s.solution(a), 7);
    }

    @Test
    public void test_6() {
        int[] a = {9};
        assertEquals(s.solution(a), 9);
    }

}
