package net.jkrieger.codility.countingelements;

import java.util.Arrays;
import java.util.TreeSet;

public class MissingInteger {

    // 100%
    public int solution(int[] A) {
        int solution = 1;
        Arrays.sort(A);
        for (int value : A) {
            if (value == solution) {
                solution++;
            } else if (value > solution) {
                return solution;
            }
        }
        return solution;
    }

    // 88%
    public int solution1(int[] A) {
        int solution = 1;
        TreeSet<Integer> set = new TreeSet<>();
        for (int value : A) {
            if (value > 0)
                set.add(value);
        }
        for (Integer value : set) {
            if (value == solution) {
                solution++;
            } else if (value > solution) {
                return solution;
            }
        }
        return solution;
    }
}
