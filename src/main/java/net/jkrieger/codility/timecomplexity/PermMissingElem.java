package net.jkrieger.codility.timecomplexity;

import java.util.Arrays;

public class PermMissingElem {

    public int solution(int[] A) {
        int solution = 1;
        if (A.length > 0) {
            Arrays.sort(A);
            for (int value : A) {
                if (value > solution) {
                    return solution;
                }
                solution++;
            }
        }
        return solution;
    }
}
